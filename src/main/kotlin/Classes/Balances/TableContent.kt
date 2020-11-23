package Classes.Balances

import Classes.Count
import javafx.beans.property.SimpleListProperty
import tornadofx.asObservable

object TableContent {

    val allCounts = mutableListOf<Count>().asObservable()
    val allCountsProperty = SimpleListProperty(allCounts)

}