package view
import javafx.scene.paint.Color
import tornadofx.*


class MenuView() :View() {

    override val root = vbox {
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
                    item("Costo del venduto"){
                        action {
                            val a = find<MainView>()
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
        separator()
    }
}