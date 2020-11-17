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

        title = "EnterPrize - Menù"

        
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
                    println(a.netRevenues())
                    println(a.costOfSales())
                    println(a.grossOperativeResult())
                }
            }

            style {
                borderColor.add(CssBox(Color.CADETBLUE,Color.CADETBLUE,Color.CADETBLUE,Color.CADETBLUE))
                backgroundColor.add(Color.LIGHTBLUE)
            }
            
        }

    }
}
