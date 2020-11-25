package view
import Classes.Balances.TableContent
import Classes.Count
import Classes.RDVBalanceContentCatcher
import javafx.beans.property.StringProperty
import javafx.scene.layout.Priority
import javafx.stage.FileChooser
import tornadofx.*


class MainView :View() {

    init {
        val fileChooser = chooseFile("EnterPrize - CARICA IL BILANCIO", arrayOf(FileChooser.ExtensionFilter("Excell File", "*.xlsx")))
        RDVBalanceContentCatcher(fileChooser[0].absolutePath)
    }

    override val root = tableview(TableContent.allCountsProperty) {

        title = "Bilancio d'esercizio"

        column("ID", Count::countId)
        column("Nome", Count::countName)
        column("Valore", Count::countValue)
        column("Tipo", Count::countType)
        column("Durata", Count::countDuration)

        contextmenu {
            item("Modifica").action {
                workspace.openInternalWindow<ModifierPopUp>()
            }

        }


    }
}