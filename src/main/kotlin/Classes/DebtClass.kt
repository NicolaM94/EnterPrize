package Classes

import javafx.beans.property.SimpleListProperty
import tornadofx.asObservable

class DebtClass () {

    val allDebtCounts = mutableListOf<Count>()
    val allDebtCountsProperty = SimpleListProperty(allDebtCounts.asObservable())

}