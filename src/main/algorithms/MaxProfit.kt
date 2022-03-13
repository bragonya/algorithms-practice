package main.algorithms

import kotlin.math.max

class MaxProfit {

    fun solve(profit: IntArray, k: Int): Int {

        // sup - (inf-1)
        var max = 0
        val preProcess = profit.map { max += it; max }.toIntArray()

        fun getRangeSum(inf: Int, sup: Int): Int {
            if (inf - 1 < 0) return preProcess[sup]
            val result = preProcess[sup] - preProcess[inf - 1]
            return if(sup < inf) preProcess.last() + result else result
        }

        var result = Int.MIN_VALUE
        val n = profit.size
        val b = n/2 - k
        for(i in 0 until n/2){
            val p1 = getRangeSum(i, i+k-1)
            val p2 = getRangeSum(i + k + b, (i + 2*k+b-1)%n)
            result = max(result, p1 + p2)
        }

        return result
    }
}