package main.algorithms

import java.util.*

// problem: https://leetcode.com/problems/3sum/
class Sum3 {

    fun threeSum(nums: IntArray) : List<List<Int>> {
        val positives = nums.filter { it >=0 }.sorted()
        val negatives = nums.filter { it < 0 }.sorted()
        val output = mutableSetOf<List<Int>>()

        if(positives.count { it == 0 } >= 3) output.add(listOf(0,0,0))


        nums.distinct().forEach { currentNumber ->
            val oppositeList = if(currentNumber < 0) positives else negatives

            val oppositeNumber = currentNumber * -1

            var i = 0
            var j = oppositeList.indices.last
            while (i < j){
                val num1 = oppositeList[i]
                val num2 = oppositeList[j]

                if(num1 + num2 < oppositeNumber){
                    i++
                }else if(num1 + num2  > oppositeNumber){
                    j--
                }else{
                    if(currentNumber < 0) output.add(listOf(currentNumber, num1, num2)) else output.add(listOf(num1, num2, currentNumber))
                    i++
                }
            }
        }
        return output.toList()
    }
}