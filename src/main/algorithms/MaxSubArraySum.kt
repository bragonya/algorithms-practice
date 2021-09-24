package main.algorithms

// problem: https://leetcode.com/problems/maximum-subarray/
class MaxSubArraySum {

    fun maxSubArray(array: IntArray): Int {


        var maxSum = 0
        var currentSum =-100000


        for(number in array){

            if(currentSum < 0)
                currentSum = 0

            currentSum += number

            maxSum = Math.max(maxSum, currentSum)
        }

        return maxSum
    }
}