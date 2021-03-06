package view
import javafx.scene.Parent
import javafx.stage.FileChooser
import tornadofx.*
import java.awt.Insets

class FileMenu :View() {

    override val root = menubar {



        menu("File") {
            item("Home").action {
                workspace.dock<MainView>()
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

}