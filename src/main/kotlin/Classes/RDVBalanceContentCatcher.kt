package Classes

import Classes.Balances.TableContent
import javafx.beans.property.SimpleListProperty
import org.apache.poi.openxml4j.opc.OPCPackage
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import tornadofx.asObservable
import tornadofx.find


class RDVBalanceContentCatcher (pathToBalanceMethod:String){

    val pathToBalance = pathToBalanceMethod
    val pacakge = OPCPackage.open(pathToBalance)

    val workbook = XSSFWorkbook(pacakge)

    val activities = AssetClass.allAssetCountsProperty
    val debts = DebtClass.allDebtCountsProperty
    val costs = CostClass.allCostCountsProperty
    val revenues = RevenuesClass.allRevenuesCountsProperty

    init {

        var currentSheet = workbook.getSheet("STATO PATRIMONIALE")

        for (row in currentSheet) {

            var currentCell = row.getCell(0)?.toString() ?:"null"
            if (currentCell.startsWith("1")) {
                activities.add(
                        Count (
                                currentCell.toDouble(),
                                row.getCell(1).toString(),
                                row.getCell(2).toString().toDouble(),
                                "Asset patrimoniale",
                                if (row.getCell(2).toString().toDouble() < 14000.00) "Lunga" else "Breve"
                        )
                )
            }

            currentCell = row.getCell(3)?.toString() ?:"null"
            if (currentCell.startsWith("2")) {
                debts.add(
                        Count(
                                currentCell.toDouble(),
                                row.getCell(4).toString(),
                                row.getCell(5).toString().toDouble(),
                                "Debito",
                                if (row.getCell(2).toString().toDouble() < 25400.00) "Lunga" else "Breve"
                        )
                )
            }
        }

        currentSheet = workbook.getSheet("CONTO ECONOMICO")

        for (row in currentSheet) {

            var currentCell = row.getCell(0)?.toString() ?:"null"
            if (currentCell.startsWith("3")) {
                costs.add(
                        Count(
                                currentCell.toDouble(),
                                row.getCell(1).toString(),
                                row.getCell(2).toString().toDouble(),
                                "Costo di esercizio",
                                null
                        )
                )
            }

            currentCell = row.getCell(3)?.toString() ?:"null"
            if (currentCell.startsWith("4")) {
                revenues.add(
                        Count(
                                currentCell.toDouble(),
                                row.getCell(4).toString(),
                                row.getCell(5).toString().toDouble(),
                                "Ricavo di esercizio",
                                null
                        )
                )
            }


        }



        TableContent.allCountsProperty.clear()
        activities.forEach { count ->
            TableContent.allCountsProperty.add(count)
        }
        debts.forEach { count ->
            TableContent.allCountsProperty.add(count)
        }
        costs.forEach { count ->
            TableContent.allCountsProperty.add(count)
        }
        revenues.forEach { count ->
            TableContent.allCountsProperty.add(count)
        }

    }

}