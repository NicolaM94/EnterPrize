package view

import tornadofx.*
import Classes.*
import Classes.Balances.CostOfSalesBalance
import javafx.geometry.NodeOrientation
import javafx.geometry.Orientation
import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill
import javafx.scene.paint.Color
import javafx.stage.FileChooser
import java.awt.Insets
import java.awt.Paint
import javax.swing.text.html.CSS

class MainView :View () {

    var pathToBalance :String

    init {
        val fileChooser = chooseFile("EnterPrize - CARICA IL BILANCIO", arrayOf(FileChooser.ExtensionFilter("Excell File","*.xlsx")))
        pathToBalance = fileChooser.get(0).absolutePath

    }


    override val root = borderpane {

        title = "EnterPrize @Nicola Moro - 2020"

        top = vbox {
            menubar {
                menu ("File") {}
                menu ("Visualizza") {}
            }
            separator()
            menubar {
                style {
                    this.backgroundColor.add(Color.LIGHTBLUE)
                }
                menu("Riclassificazioni") {
                    menu("Conto Economico") {
                        item("Costo del venduto"){  }
                        item ("Valore aggiunto") {}
                        item ("Margine di contribuzione") {}
                    }
                    menu("Stato Patrimoniale") {}
                }
                menu("Analisi Reddituale") { }
                menu("Analisi Patrimoniale") {}
                menu ("Analisi della solidità"){ }
                menu ("Analisi del pareggio"){  }
                menu ("Analisi del contesto") {}
                menu("Analisi clientela") {}
                menu ("Costruzione del preventivo") {}
            }
            separator()
        }

        center = tableview (RDVBalanceContentCatcher(pathToBalance).allCountsProperty) {

                column("ID",Count::countId)
                column("Nome",Count::countName)
                column("Valore",Count::countValue)
                column("Tipo",Count::countType)
                column("Durata",Count::countDuration)
        }
    }
}