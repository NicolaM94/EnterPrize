package Classes

import javafx.beans.property.SimpleListProperty
import tornadofx.asObservable

class AssetClass () {

    val allAssetsCounts = mutableListOf<Count>()
    val allAssetCountsProperty = SimpleListProperty(allAssetsCounts.asObservable())



}