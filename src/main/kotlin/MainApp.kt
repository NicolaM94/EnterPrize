package view
import javafx.stage.Stage
import tornadofx.*



class MainApp :App(WorkingSpace::class) {

    override fun onBeforeShow(view: UIComponent) {
        workspace.dock<MainView>()
    }


}