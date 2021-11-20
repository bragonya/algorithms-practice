package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class MinDifferenceTest {

    @Test fun testBasic(){

        assertEquals(
            1,
            MinDifference().minDifference(intArrayOf(1,5,0,10,14))
        )
    }
}