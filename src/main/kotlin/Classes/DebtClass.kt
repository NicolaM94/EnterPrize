package Classes

import javafx.beans.property.SimpleListProperty
import tornadofx.asObservable

object DebtClass {

    val allDebtCounts = mutableListOf<Count>()
    val allDebtCountsProperty = SimpleListProperty(allDebtCounts.asObservable())

}