package Classes

import javafx.beans.property.SimpleListProperty
import tornadofx.asObservable

class RevenuesClass () {

    val allRevenuesCounts = mutableListOf<Count>()
    val allRevenuesCountsProperty = SimpleListProperty(allRevenuesCounts.asObservable())


}