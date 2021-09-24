package main.algorithms

class LongBand {

    fun getLongBand(values: IntArray): Int{
        val valuesDictionary = values.toSet()
        var maxSequence = 0
        values.forEach {
            var counter = 0
            if(isInitialNumber(it, valuesDictionary)){
                var currentNumber = it + 1
                counter++
                while (valuesDictionary.contains(currentNumber)){
                    counter++
                    currentNumber++
                }
                maxSequence = maxSequence.coerceAtLeast(counter)
            }
        }
        return maxSequence
    }

    private fun isInitialNumber(number: Int, numbers: Set<Int>): Boolean {
        return !numbers.contains(number - 1)
    }
}