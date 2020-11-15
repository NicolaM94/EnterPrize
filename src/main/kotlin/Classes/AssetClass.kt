package Classes

import javafx.beans.property.SimpleListProperty
import tornadofx.asObservable

object AssetClass {

    val allAssetsCounts = mutableListOf<Count>()
    val allAssetCountsProperty = SimpleListProperty(allAssetsCounts.asObservable())



}