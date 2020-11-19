package view
import Classes.Balances.CostOfSalesBalance
import tornadofx.*

class CostOfSalesView() :View() {

    val menu:MenuView by inject()

    override val root = borderpane {

        top = menu.root


    }
}