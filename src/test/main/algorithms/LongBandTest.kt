package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class LongBandTest{

    @Test
    fun simpleTest(){

        assertEquals(8, LongBand().getLongBand(intArrayOf(1,9,3,0,18,5,2,4,10,7,12,6)))
    }
}