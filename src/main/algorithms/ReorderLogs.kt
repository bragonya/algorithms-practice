package main.algorithms

//problem: https://leetcode.com/problems/reorder-data-in-log-files
class ReorderLogs {

    fun reorderLogFiles(logs: Array<String>): Array<String> {

        val groups = logs.map { it.split(" ") }.map { it.slice(1..it.lastIndex).joinToString(" ") + Char.MIN_VALUE + it[0] }

        val (letters, digits) = groups.partition { !isDigit(it[0]) }

        val sortedLetters = letters.sorted()


        val preOutput = sortedLetters + digits

        return preOutput.map {
            val split = it.split(Char.MIN_VALUE)

            split[1] +" "+split[0]
        }.toTypedArray()
    }

    fun isDigit(c: Char) = c >= '0' && c <= '9'
}