package Classes

import javafx.beans.property.SimpleListProperty
import tornadofx.asObservable

object RevenuesClass {

    val allRevenuesCounts = mutableListOf<Count>()
    val allRevenuesCountsProperty = SimpleListProperty(allRevenuesCounts.asObservable())


}