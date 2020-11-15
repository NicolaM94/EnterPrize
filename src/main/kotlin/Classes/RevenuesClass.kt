package Classes

import javafx.beans.property.SimpleListProperty
import tornadofx.asObservable
import tornadofx.c

object RevenuesClass {

    val allRevenuesCounts = mutableListOf<Count>()
    val allRevenuesCountsProperty = SimpleListProperty(allRevenuesCounts.asObservable())

    fun sellsRevenues () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach { count ->
            if (count.countId in 40010.00..40100.00) collector.add(count)
        }
        return collector
    }
    fun servicesRevenues () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach { count ->
            if (count.countId in 40110.00..40200.00) collector.add(count)
        }
        return collector
    }
    fun selfConsume () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach { count ->
            if (count.countId in 40210.00..40300.00) collector.add(count)
        }
        return collector
    }
    fun agriculturalRevenues () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 40310.00..40400.00) collector.add(it)
        }
        return collector
    }
    fun adjustmentsCoreRevenues () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 40410.00..41000.00 ) collector.add(it)
        }
        return collector
    }
    fun assetsIncrementations () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 41010.00..41100.00) collector.add(it)
        }
        return collector
    }
    fun otherRevenues () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 41101.00..4199.00) collector.add(it)
        }
        return collector
    }
    fun contributionsRevenues () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 41210.00..41300.00 ) collector.add(it)
        }
        return collector
    }
    fun assetsRestorationsRevenues () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 41310.00..41500.00) collector.add(it)
        }
        return collector
    }
    fun adjustmentsOtherRevenues () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 41510.00..42000.00) collector.add(it)
        }
        return collector
    }
    fun closingInventories () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 42011.00..43000.00) collector.add(it)
        }
        return collector
    }
    fun partecipationsRevenues () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 43010.00..43100.00) collector.add(it)
        }
        return collector
    }
    fun activeInterests () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 43105.0..43200.00) collector.add(it)
        }
        return collector
    }
    fun otherFinancialRevenues () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 43210.00..43300.00) collector.add(it)
        }
        return collector
    }
    fun revaluationsRevenues () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 43310.0..44000.00) collector.add(it)
        }
        return collector
    }
    fun capitalGainRevenues () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 44010.00..44100.00 ) collector.add(it)
        }
        return collector
    }
    fun otherExtraordinaryRevenues () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 44110.00..45000.0) collector.add(it)
        }
        return collector
    }
    fun prepaidTaxes () :MutableList<Count> {
        val collector = mutableListOf<Count>()
        allRevenuesCountsProperty.forEach {
            if (it.countId in 45010.00..500.00) collector.add(it)
        }
        return collector
    }

}