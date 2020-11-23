package view

import tornadofx.*
import Classes.*
import Classes.Balances.CostOfSalesBalance
import Classes.Balances.TableContent
import javafx.beans.property.ObjectProperty
import javafx.beans.value.ObservableValue
import javafx.geometry.NodeOrientation
import javafx.geometry.Orientation
import javafx.scene.Node
import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill
import javafx.scene.paint.Color
import javafx.stage.FileChooser
import java.awt.Insets
import java.awt.Paint
import java.io.File
import javax.swing.text.html.CSS

class MainView :View () {

    init {
        val fileChooser = chooseFile("EnterPrize - CARICA IL BILANCIO", arrayOf(FileChooser.ExtensionFilter("Excell File","*.xlsx")))
        RDVBalanceContentCatcher(fileChooser[0].absolutePath)
    }

    override val root = borderpane {

        title = "EnterPrize @Nicola Moro - 2020"

        top = menubar {
            menu("File") {
                item("Carica bilancio").action {
                    val alpha = chooseFile(
                            title = "EnterPrize - Carica il bilancio",
                            filters = arrayOf(FileChooser.ExtensionFilter("Excell","*.xlsx")),
                            mode = FileChooserMode.Single
                    )
                    center = borderpane()
                }
            }
            menu ("Visualizza") {}
            menu ("La mia azienda"){

            }
        }

        center = tableview (TableContent.allCountsProperty) {

            column("ID",Count::countId)
            column("Nome",Count::countName)
            column("Valore",Count::countValue)
            column("Tipo",Count::countType)
            column("Durata",Count::countDuration)

            contextmenu {
                item("Modifica").action {
                    openInternalWindow<ModifierPopUp>()
                }
            }

        }

        bottom = menubar {
            style {
                this.backgroundColor.add(Color.LIGHTBLUE)
            }
            menu("Riclassificazioni") {
                menu("Conto Economico") {
                    item("Costo del venduto"){
                        action {
                            val a = find (MainView::class)
                            a.replaceWith<CostOfSalesView>()
                        }
                    }
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
    }
}