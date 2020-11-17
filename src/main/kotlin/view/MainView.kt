package view

import tornadofx.*
import Classes.*
import Classes.Balances.CostOfSalesBalance
import javafx.scene.paint.Color
import javafx.stage.FileChooser
import java.awt.Paint

class MainView :View () {

    var pathToBalance :String

    init {
        val fileChooser = chooseFile("EnterPrize - CARICA IL BILANCIO", arrayOf(FileChooser.ExtensionFilter("Excell File","*.xlsx")))
        pathToBalance = fileChooser.get(0).absolutePath

    }


    override val root = borderpane {

        title = "EnterPrize @Nicola Moro - 2020"

        
        left = vbox {
            label ("Altre funzioni") {  }
            style {
                backgroundColor.add(Color.LIGHTBLUE)
            }
        }

        center = tableview (RDVBalanceContentCatcher(pathToBalance).allCountsProperty) {

            column("ID",Count::countId)
            column("Nome",Count::countName)
            column("Valore",Count::countValue)
            column("Tipo",Count::countType)
            column("Durata",Count::countDuration)
        }



        right = vbox {

            label ("Altre funzioni") {  }
            button ("C.E. Al costo del venduto") {
                action {
                    val a = CostOfSalesBalance
                    println("Ricavi Netti: ${a.netRevenues()}")
                    println("Costo del venduto: ${a.costOfSales()}")
                    println("Risultato della gestione industriale: ${a.grossOperativeResult}")
                    println("Costi commerciali: ${a.commercialCosts()}")
                    println("Risultato operativo: ${a.operativeResult}")
                    println("Risultato della gestione: ${a.managerialResult}")
                }
            }
        }
    }
}
