package main.adventofcode

class BinaryDiagnostic {

    fun solve(input: List<String>): Int {
        val n = input[0].length
        val mostCommon = StringBuilder()
        val leastCommon = StringBuilder()
        for (i in 0 until n){
            val n0s = input.map { it[i] }.count { it == '0' }
            val n1s = input.size - n0s
            val mostCommonN = if(n0s > n1s) 0 else 1
            val leastCommonN = if(mostCommonN == 0) 1 else 0
            mostCommon.append(mostCommonN)
            leastCommon.append(leastCommonN)
        }

        return Integer.parseInt(mostCommon.toString(), 2) * Integer.parseInt(leastCommon.toString(), 2)
    }
}