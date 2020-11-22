package view
import Classes.RDVBalanceContentCatcher
import org.codehaus.groovy.tools.shell.Main
import tornadofx.*


class ModifierPopUp :View() {

    override val root = form {

        fieldset ("Modifica conto"){

            field ("Nome"){ textfield() }
            field ("Valore"){ textfield() }
            field ("Durata"){ textfield() }

            button ("Salva modifiche"){
                 action {

                 }
            }
            button ("Esci").action { close() }
        }
    }
}