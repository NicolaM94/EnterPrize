/**Test di assegnazione automatica dei conti */

fun main () {

    val words = mutableListOf("Capitale Netto","CapitaleProprio","Capitale Sociale","Capitale Nero","Capitale Bianco")
    val results = mutableListOf<Map<String,Any>>()
    val testWord = "Netto di Capitale".split(" ")

    words.forEach {
        val subList = it.split(" ")
        var result = 0
        testWord.forEach {word ->
            if (word in subList) result += 1
        }
        results.add(mapOf(
            "Possible final count" to it,
            "Tested Word" to testWord,
            "Same Words" to result,
            "% of similar words" to result/testWord.size.toDouble()
        ))
    }

    results.forEach {
        println(it)
    }


}