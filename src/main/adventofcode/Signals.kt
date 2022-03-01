package main.adventofcode

class Signals {

    fun solve(numbers: List<Int>): Int {
        var counter = 0
        for(i in 1.. numbers.lastIndex) {
            val previousNumber = numbers[i-1]
            val number = numbers[i]

            if(number > previousNumber) {
                counter++
            }
        }

        return counter
    }

    fun solvePart2(numbers: List<Int>): Int {
        var counter = 0
        var n_1 = numbers[0] + numbers[1] + numbers[2]
        for(i in 1.. numbers.lastIndex-2) {

            val n_2 = numbers[i] + numbers[i+1] + numbers[i+2]

            if(n_2 > n_1) {
                counter++
            }
            n_1 = n_2
        }

        return counter
    }
}