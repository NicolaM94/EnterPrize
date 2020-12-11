import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File

fun doubler (cell : Cell) :Boolean {
    try {
        cell.toString().toDouble()
        return true
    } catch (error:java.lang.NumberFormatException) {
        return false
    }
}


fun main() {

    val inputFile = File("/home/nicola/Downloads/copiatest(1).xlsx")
    val inputStream = inputFile.inputStream()
    val excellReader = XSSFWorkbook(inputStream)
    val counts = mutableMapOf<Cell,Cell>()

    if (File("/home/nicola/Desktop/log.csv").exists()) {
        File("/home/nicola/Desktop/log.csv").delete()
        val outputFile = File("/home/nicola/Desktop/log.csv")
    }

    val outputFile = File("/home/nicola/Desktop/log.csv")

    println(excellReader.numberOfSheets)

    for (sheet in 0..excellReader.numberOfSheets) {

        println(excellReader.getSheetName(excellReader.activeSheetIndex))
        outputFile.appendText(excellReader.getSheetName(excellReader.activeSheetIndex))
        excellReader.getSheetAt(0).forEach { row ->
            row.forEach { cell ->
                if (doubler(cell) && row.getCell(cell.columnIndex-1) != null) {
                    val getter = row.getCell(cell.rowIndex)
                    try {
                        counts[row.getCell(cell.columnIndex+1)] = cell
                        //println("${row.getCell(cell.columnIndex - 1)}, ${cell}\n")
                    } catch (error: java.lang.IllegalArgumentException) {
                        println("Skipping a cell")
                    }
                }
            }
        }
    }
    counts.forEach{
        println("${it.key}, ${it.value}")
    }
}