import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File

fun doubleTest (cell: Cell) :Boolean{
    var result = true
    try {
        cell.toString().toDouble()
    } catch (error: java.lang.IllegalArgumentException) {
        result = false
        println("$cell double test result: $result ")
    }
    return result
}

fun beforeCellExists (row: Row,cell: Cell) :Boolean {
    try {
        val cellBefore = row.getCell(cell.columnIndex -1 )
        println("$cell existsACellBefore result: true ")
        return cellBefore != null
    } catch (error: java.lang.NullPointerException) {
        println("$cell existsACellBefore result: false. Skipping double test...")
        return false
    } catch (error: java.lang.IllegalArgumentException) {
        println("$cell existsACellBefore result: false.  Skipping double test...")
        return false
    }
}


fun main() {

    val countsCollector :MutableMap<Cell,Cell> = mutableMapOf()
    val fileToParse = File("/home/nicola/Downloads/copiatest(1).xlsx")
    val activeWorkbook = XSSFWorkbook(fileToParse.inputStream())

    println("\nStarted parsing ${fileToParse.absolutePath}\n")
    for (sheetIndex in 0..activeWorkbook.numberOfSheets-1) {

        val activeSheet = activeWorkbook.getSheetAt(sheetIndex)

        activeSheet.forEach { row ->
            row.forEach { cell ->
                if (beforeCellExists(row,cell) && doubleTest(cell)) {
                    countsCollector[row.getCell(cell.columnIndex-1)] = cell
                }
            }
        }
    }

    println("\nCells collected...Cleaning up!\n")
    val secondCountsCollector :MutableMap<Cell,Cell> = mutableMapOf()
    countsCollector.forEach { cell, cell2 ->
        try {
            cell.toString().toDouble()
        } catch (error:java.lang.IllegalArgumentException) {
            secondCountsCollector[cell] = cell2
        }
    }
    println("\nClean up done! Printing results...\n")
    val fileToPrint = File ("/home/nicola/Desktop/log.txt")
    secondCountsCollector.forEach{cell, cell2 ->
        fileToPrint.appendText("$cell : $cell2\n")
    }
    println("\nFinito!")
}