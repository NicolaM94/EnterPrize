package Classes

import javafx.beans.property.SimpleListProperty
import tornadofx.asObservable

object CostClass  {

    val allCostsCounts = mutableListOf<Count>()
    val allCostCountsProperty = SimpleListProperty(allCostsCounts.asObservable())


}