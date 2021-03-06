package view

import tornadofx.*

class ActivityMenu :View() {

        override val root = menubar {
        style {
            this.backgroundColor.add(javafx.scene.paint.Color.LIGHTBLUE)
            paddingTop = 5.0
            paddingBottom = 5.0
        }

        menu("Riclassificazioni") {
            menu("Conto Economico") {
                item("Costo del venduto"){
                    action {
                        workspace.dock<CostOfSalesView>()
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