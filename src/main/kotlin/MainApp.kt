package view
import javafx.stage.Stage
import tornadofx.*



class MainApp :App(VeryFirstView::class) {

    override fun onBeforeShow(view: UIComponent) {
        workspace.dock<FirstView>()
    }

}