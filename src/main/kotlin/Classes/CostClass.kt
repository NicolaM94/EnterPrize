package Classes

import javafx.beans.property.SimpleListProperty
import tornadofx.asObservable

class CostClass () {

    val allCostsCounts = mutableListOf<Count>()
    val allCostCountsProperty = SimpleListProperty(allCostsCounts.asObservable())

}