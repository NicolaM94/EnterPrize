package Classes.Balances

import Classes.CostClass
import Classes.RevenuesClass

object CostOfSalesBalance {

    fun netRevenues () :Double {
        var result = 0.00
        result += RevenuesClass.sellsRevenues().sumOf { it.countValue }
        result += RevenuesClass.servicesRevenues().sumOf { it.countValue }
        result -= RevenuesClass.adjustmentsCoreRevenues().sumOf { it.countValue }
        result += RevenuesClass.agriculturalRevenues().sumOf { it.countValue }
        return result
    }
    fun costOfSales () :Double {
        var result = 0.00
        result += CostClass.startingInventories().sumOf { it.countValue }
        result += CostClass.purchaseCosts().sumOf { it.countValue }
        return result
    }
    fun grossOperativeResult () :Double {
        return netRevenues() - costOfSales()
    }

}

