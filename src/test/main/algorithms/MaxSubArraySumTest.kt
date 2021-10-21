package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class MaxSubArraySumTest{

    @Test
    fun testMaxSum(){

        /*assertEquals(13, MaxSubArraySum().getMaxSubArraySum(intArrayOf(-1,2,3,4,-2,6,-8,3)))
        assertEquals(14, MaxSubArraySum().getMaxSubArraySum(intArrayOf(5,-2,3,-1,-1,8,2,-5,-4,-3)))*/
        //assertEquals(23, MaxSubArraySum().maxSubArray(intArrayOf(5,4,-1,7,8)))
        assertEquals(-1, MaxSubArraySum().maxSubArray(intArrayOf(-2, -1)))
    }
}