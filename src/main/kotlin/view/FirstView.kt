package view
import Classes.RDVBalanceContentCatcher
import javafx.scene.layout.Priority
import javafx.stage.FileChooser
import tornadofx.*


class FirstView :View() {

    val injectedView :MainView by inject()

    init {
        val fileChooser = chooseFile("EnterPrize - CARICA IL BILANCIO", arrayOf(FileChooser.ExtensionFilter("Excell File","*.xlsx")))
        RDVBalanceContentCatcher(fileChooser[0].absolutePath)
    }

    override val root = vbox {

        menubar {
            menu("File") {
                item("\u2B8C Home").action {
                    parent.getChildList()?.set(2,injectedView.root)
                }
                item("Carica bilancio").action {
                    val alpha = chooseFile(
                            title = "EnterPrize - Carica il bilancio",
                            filters = arrayOf(FileChooser.ExtensionFilter("Excell","*.xlsx")),
                            mode = FileChooserMode.Single
                    )
                }
            }
            menu ("Visualizza") {}
            menu ("La mia azienda"){

            }
        }
        menubar {
            style {
                this.backgroundColor.add(javafx.scene.paint.Color.LIGHTBLUE)
            }

            menu("Riclassificazioni") {
                menu("Conto Economico") {
                    item("Costo del venduto"){
                        action {
                            /*val a = find (MainView::class)
                            a.replaceWith<CostOfSalesView>()*/
                            val getter = find(CostOfSalesView::class)
                            parent.getChildList()?.set(2,getter.root)
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

        this.add(injectedView.root)



    }

}