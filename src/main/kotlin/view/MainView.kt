package view

import tornadofx.*
import Classes.*
import javafx.stage.FileChooser

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
        }

        center = tableview (RDVBalanceContentCatcher(pathToBalance).allCountsProperty){

            column("ID",Count::countId)
            column("Descrizione",Count::countName)
            column("Valore",Count::countValue)

        }

        right = vbox {

            label ("Altre funzioni") {  }
            
        }

    }
}
