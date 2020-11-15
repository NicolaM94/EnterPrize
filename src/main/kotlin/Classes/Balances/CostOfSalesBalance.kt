package Classes.Balances

import Classes.RDVBalanceContentCatcher
import Classes.RevenuesClass
import tornadofx.find
import Classes.*

class CostOfSalesBalance () {

    var netRevenues :Double = 0.0
    val costOfSales :Double = 0.0

    init {
        //Populating netRevenues
        RevenuesClass.allRevenuesCountsProperty.forEach { count ->
            when (count.countId) {
                in 40010.00..40200.00 -> netRevenues += count.countValue
                in 40300.00..40400.00 -> netRevenues += count.countValue
                in 40410.00..40500.00 -> netRevenues += count.countValue
            }
        }
        //Populating costOfSales
        CostClass.allCostCountsProperty.forEach {
            //TODO Finish to populate costOfSales
        }
    }



}

