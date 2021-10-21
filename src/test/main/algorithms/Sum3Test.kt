package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class Sum3Test {

    @Test
    fun sum3BasicTest(){
        assertEquals(
            listOf(listOf(-1,0,1)),
            Sum3().threeSum(intArrayOf(-1,0,1,0))
        )


        assertEquals(
            listOf(listOf(-1,0,1), listOf(-1,-1,2)),
            Sum3().threeSum(intArrayOf(-1,0,1,2,-1,-4))
        )
    }
}