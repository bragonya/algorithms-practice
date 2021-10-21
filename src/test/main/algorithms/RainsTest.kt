package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class RainsTest {

    @Test
    fun testWaterAmount(){

        assertEquals(6, Rains().getWater(intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1)))
    }
}