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
        result += CostClass.chargesOnPurchasesCosts().sumOf { it.countValue }
        result += CostClass.adjustmentsCoreCosts().sumOf { it.countValue }
        result += CostClass.industrialCosts().sumOf { it.countValue }
        result += CostClass.rentsCosts().sumOf { it.countValue }
        result += CostClass.otherRentsCosts().sumOf { it.countValue }
        result += CostClass.salariesCosts().sumOf { it.countValue }
        result += CostClass.socialSecurityCosts().sumOf { it.countValue }
        result += CostClass.severanciesCosts().sumOf { it.countValue }
        result += CostClass.othersWorkersCosts().sumOf { it.countValue }
        result += CostClass.utilitiesCosts().sumOf { it.countValue }
        result += CostClass.industrialDeprectiations().sumOf { it.countValue }
        result -= RevenuesClass.closingInventories().sumOf { it.countValue }
        result += CostClass.fieldsAndFabricatesDepreciations().sumOf { it.countValue }
        result += CostClass.veichlesDepreciations().sumOf { it.countValue }
        return result
    }

    val grossOperativeResult :Double by lazy {
        netRevenues() - costOfSales()
    }

    fun commercialCosts () :Double {
        var result = 0.00
        result += CostClass.commercialCosts().sumOf { it.countValue }
        result += CostClass.managersCosts().sumOf { it.countValue }
        result += CostClass.collaboratorsCosts().sumOf { it.countValue }
        result += CostClass.associatesCosts().sumOf { it.countValue }
        result += CostClass.salesmenCosts().sumOf { it.countValue }
        result += CostClass.professialConsultantsCosts().sumOf { it.countValue }
        result += CostClass.otherServicesCosts().sumOf { it.countValue }
        result += CostClass.adjustmentsServicesCosts().sumOf { it.countValue}
        result += CostClass.leasingCosts().sumOf { it.countValue }
        result += CostClass.otherleasingCosts().sumOf { it.countValue }
        result += CostClass.adjustmentsLeasingCosts().sumOf { it.countValue }
        result += CostClass.commercialDepreciations().sumOf { it.countValue }
        return result
    }

    val operativeResult :Double by lazy {
        grossOperativeResult - commercialCosts()
    }

    fun financialRevenues () :Double {
        var result = 0.00
        result += RevenuesClass.partecipationsRevenues().sumOf { it.countValue }
        result += RevenuesClass.activeInterests().sumOf { it.countValue }
        result += RevenuesClass.otherFinancialRevenues().sumOf { it.countValue }
        result += RevenuesClass.capitalGainRevenues().sumOf { it.countValue }
        return result
    }
    fun financialCosts () :Double {
        var result = 0.00
        result += CostClass.capitalLossesOfPartecipations().sumOf { it.countValue }
        result += CostClass.passiveInterests().sumOf { it.countValue }
        result += CostClass.otherFinancialCosts().sumOf { it.countValue }
        result += CostClass.depreciationsFinancialActivities().sumOf { it.countValue }
        return result
    }

    val managerialResult :Double by lazy {
        operativeResult + financialRevenues() - financialCosts()
    }


}

