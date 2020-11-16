package Classes

import javafx.beans.property.SimpleListProperty
import tornadofx.asObservable
import java.util.zip.CheckedOutputStream
import javax.swing.text.MutableAttributeSet

object CostClass  {

    val allCostsCounts = mutableListOf<Count>()
    val allCostCountsProperty = SimpleListProperty(allCostsCounts.asObservable())

    fun purchaseCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 30010.00..30100.0) collector.add(it)
        }
        return collector
    }
    fun chargesOnPurchasesCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 30110.00..30200.0) collector.add(it)
        }
        return collector
    }
    fun adjustmentsCoreCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 30210.00..31000.0) collector.add(it)
        }
        return collector
    }
    fun industrialCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId  in 31011.00..31100.0) collector.add(it)
        }
        return collector
    }
    fun commercialCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 31110.00..31200.0) collector.add(it)
        }
        return collector
    }
    fun utilitiesCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 31211.00..31300.0) collector.add(it)
        }
        return collector
    }
    fun managersCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 31310.00..31400.0) collector.add(it)
        }
        return collector
    }
    fun collaboratorsCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 31410.00..31500.0) collector.add(it)
        }
        return collector
    }
    fun associatesCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 31510.00..31600.0) collector.add(it)
        }
        return collector
    }
    fun salesmenCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 31610.00..31700.0) collector.add(it)
        }
        return collector
    }
    fun professialConsultantsCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 31710.00..31800.0) collector.add(it)
        }
        return collector
    }
    fun otherServicesCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 31810.00..31900.0) collector.add(it)
        }
        return collector
    }
    fun adjustmentsServicesCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 31910.00..32000.0) collector.add(it)
        }
        return collector
    }
    fun rentsCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 32010.00..32100.0) collector.add(it)
        }
        return collector
    }
    fun otherRentsCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 32110.00..32200.0) collector.add(it)
        }
        return collector
    }
    fun leasingCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 32210.00..32300.0) collector.add(it)
        }
        return collector
    }
    fun otherleasingCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 32310.00..32400.0) collector.add(it)
        }
        return collector
    }
    fun adjustmentsLeasingCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 32410.00..33000.0) collector.add(it)
        }
        return collector
    }
    fun salariesCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 33010.0..33100.0) collector.add(it)
        }
        return collector
    }
    fun socialSecurityCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 33110.00..33210.0) collector.add(it)
        }
        return collector
    }
    fun severanciesCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 33210.00..33400.0) collector.add(it)
        }
        return collector
    }
    fun othersWorkersCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 33410.00..34000.0) collector.add(it)
        }
        return collector
    }
    fun intangibleDepreciations () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 34001.00..34100.0) collector.add(it)
        }
        return collector
    }
    fun fieldsAndFabricatesDepreciations () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 34101.00..34110.0) collector.add(it)
        }
        return collector
    }
    fun industrialDeprectiations () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 34111.00..34122.99) collector.add(it)
        }
        return collector
    }
    fun commercialDepreciations () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 34122.00..34134.99) collector.add(it)
        }
        return collector
    }
    fun veichlesDepreciations () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 34135.00..34200.0) collector.add(it)
        }
        return collector
    }
    fun depreciationsIntangibleAssets () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 34201.00..34300.0) collector.add(it)
        }
        return collector
    }
    fun depreciationsTangibleAssets () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 34301.00..34400.0) collector.add(it)
        }
        return collector
    }
    fun inventoriesDeprecitations () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 34411.00..34500.0) collector.add(it)
        }
        return collector
    }
    fun riskFundsProvisions () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 34510.00..35000.0) collector.add(it)
        }
        return collector
    }
    fun taxesAndRights () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 35001.00..35200.0) collector.add(it)
        }
        return collector
    }
    fun otherManagerialCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 35201.00..35300.0) collector.add(it)
        }
        return collector
    }
    fun adjustmentsManagerialCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 35310.00..36000.0) collector.add(it)
        }
        return collector
    }

    fun startingInventories () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 36011.00..37000.0) collector.add(it)
        }
        return collector
    }
    fun capitalLossesOfPartecipations () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 37010.00..37100.0) collector.add(it)
        }
        return collector
    }
    fun passiveInterests () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 37111.00..37200.0) collector.add(it)
        }
        return collector
    }
    fun otherFinancialCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 37201.00..37300.0) collector.add(it)
        }
        return collector
    }
    fun depreciationsFinancialActivities () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 37310.00..38000.0) collector.add(it)
        }
        return collector
    }
    fun extraordinaryCapitalLosses () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 38010.00..38100.0) collector.add(it)
        }
        return collector
    }
    fun previousAndDeferredTaxes () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 38110.00..38200.0 || it.countId in 39010.00..39200.00) collector.add(it)
        }
        return collector
    }
    fun otherExtraordinaryCosts () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 38210.00..39000.0) collector.add(it)
        }
        return collector
    }
    fun revenuesConsolidatedRegime () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 39260.00..39360.99) collector.add(it)
        }
        return collector
    }
    fun costsConsolidatedRegime () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 39210.00..39310.99) collector.add(it)
        }
        return collector
    }
    fun profitOrLoss () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allCostCountsProperty.forEach {
            if (it.countId in 39510.00..39580.99) collector.add(it)
        }
        return collector
    }
}