package main.algorithms

// problem: https://leetcode.com/problems/trapping-rain-water/
class Rains {


    fun getWater(heights: IntArray): Int {
        var max = 0
        val leftHeights = heights.map {
            max = Math.max(max, it)
            max
        }
        max = 0
        val rightHeights = heights.reversed().map {
            max = Math.max(max, it)
            max
        }.reversed()

        var water = 0
        heights.forEachIndexed { index, i ->
            val border = Math.min(leftHeights[index], rightHeights[index])
            water += border - i
        }

        return water
    }
}