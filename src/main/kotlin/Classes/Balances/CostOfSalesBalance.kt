package Classes.Balances

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



}

