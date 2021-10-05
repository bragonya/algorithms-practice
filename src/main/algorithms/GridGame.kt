package main.algorithms


class GridGame {

    fun solution2(grid: Array<LongArray>): Long {
        val n: Int = grid[0].size
        val pre = LongArray(n + 1)
        val suf = LongArray(n + 1)
        var ans = Long.MAX_VALUE
        for (i in 0 until n) {
            suf[n - i - 1] = suf[n - i] + grid[0][n - i - 1]
            pre[i + 1] = pre[i] + grid[1][i]
        }
        for (i in 0 until n) {
            ans = Math.min(ans, Math.max(pre[i], suf[i + 1]))
        }
        return ans
    }

    fun solution(matrix: Array<IntArray>): Long {

        val preComputedPaths = preComputePaths(matrix)

        var maxValue = Long.MAX_VALUE

        for(i in preComputedPaths[0].indices){
            val leftDownValue = preComputedPaths[1].getOrNull(i - 1) ?: 0
            val rightUpValue = preComputedPaths[0].getOrNull(i+1) ?: 0
            maxValue = Math.min(maxValue, Math.max(leftDownValue, rightUpValue))
        }
        return maxValue
    }

    private fun preComputePaths(matrix: Array<IntArray>): List<LongArray> {

        val row1 = matrix[0]
        val row2 = matrix[1]

        val precomputedPathRow1 = cumulativeSumReversed(row1)
        val reversedPrecomputedPathRow2 = cumulativeSum(row2)

        return listOf(precomputedPathRow1, reversedPrecomputedPathRow2)
    }

    private fun cumulativeSum(intArray: IntArray): LongArray {
        var cumulation = 0L

        return intArray.map {
            cumulation += it
            cumulation
        }.toLongArray()
    }

    private fun cumulativeSumReversed(intArray: IntArray): LongArray {
        var cumulation = 0L

        val output = LongArray(intArray.size)

        for (i in intArray.indices.reversed()){
            cumulation += intArray[i]
            output[i] = cumulation
        }
        return output
    }
}