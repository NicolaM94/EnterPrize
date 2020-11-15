package Classes

import javafx.beans.property.SimpleListProperty
import tornadofx.asObservable
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



}