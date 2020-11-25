package view
import javafx.beans.property.SimpleDoubleProperty
import javafx.beans.property.SimpleStringProperty
import javafx.scene.layout.Priority
import tornadofx.*


class ModifierPopUp :View() {

    val fieldsGetter: MainView by inject()
    val nameField = SimpleStringProperty(fieldsGetter.root.selectedItem?.countName)
    val valueField = SimpleDoubleProperty(fieldsGetter.root.selectedItem?.countValue!!)
    val durationField = SimpleStringProperty(fieldsGetter.root.selectedItem?.countDuration)

    override val root = form {

        style {

            setPrefSize(500.0,300.0)
            usePrefSize
        }
        fieldset ("Modifica conto"){
            style {
                stackpaneConstraints {
                    vgrow = Priority.ALWAYS
                }
            }

            val nameField = field ("Nome"){ textfield(nameField) }
            val valueField = field ("Valore"){ textfield(valueField) }
            val durationField = field ("Durata"){ textfield(durationField) }

            button ("Salva modifiche"){
                spacing = 25.0
                action {


                 }
            }
            button ("Esci").action { close() }
        }
    }
}