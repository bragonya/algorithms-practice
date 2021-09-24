package main.algorithms

import kotlin.math.min

// problem: https://leetcode.com/problems/container-with-most-water/
class ContainerWithMostWater {

    fun maxArea(height: IntArray): Int {
        var i = 0
        var j = height.size - 1

        var maxArea  = 0
        while (i < j) {
            val currentL = height[i]
            val currentR = height[j]

            val currentArea = (j - i) * min(currentL,currentR)

            if(currentL > currentR){
                j--
            }else{
                i++
            }

            maxArea = maxArea.coerceAtLeast(currentArea)
        }

        return maxArea
    }
}