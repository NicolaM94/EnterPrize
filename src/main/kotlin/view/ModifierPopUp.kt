package view
import Classes.RDVBalanceContentCatcher
import tornadofx.*


class ModifierPopUp :View() {

    override val root = form {

        fieldset ("Modifica conto"){

            field ("Nome"){ textfield() }
            field ("Valore"){ textfield() }
            field ("Durata"){ textfield() }

            button ("Salva modifiche"){
                 //TODO Finish implementig changes of costs
            }
            button ("Esci").action { close() }
        }
    }
}