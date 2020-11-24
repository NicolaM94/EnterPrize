package view
import Classes.Balances.TableContent
import Classes.Count
import Classes.RDVBalanceContentCatcher
import javafx.scene.layout.Priority
import javafx.stage.FileChooser
import tornadofx.*


class FirstView :View() {

    init {
        val fileChooser = chooseFile("EnterPrize - CARICA IL BILANCIO", arrayOf(FileChooser.ExtensionFilter("Excell File","*.xlsx")))
        RDVBalanceContentCatcher(fileChooser[0].absolutePath)
    }

    override val root = tableview (TableContent.allCountsProperty) {

        column("ID",Count::countId)
        column("Nome",Count::countName)
        column("Valore",Count::countValue)
        column("Tipo",Count::countType)
        column("Durata",Count::countDuration)

    }

}