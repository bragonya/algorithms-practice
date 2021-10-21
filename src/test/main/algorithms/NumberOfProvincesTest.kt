package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class NumberOfProvincesTest {

    @Test
    fun testBasicProvinces(){
        // [[1,0,0],[0,1,0],[0,0,1]] should be 3

        assertEquals(
            3,
            NumberOfProvinces().findCircleNum(
                arrayOf(
                    intArrayOf(1,0,0),
                    intArrayOf(0,1,0),
                    intArrayOf(0,0,1)
                )
            )
        )
    }

    @Test
    fun testProvincesWithConnection(){
        // [[1,1,0],[1,1,0],[0,0,1]] should be 2

        assertEquals(
            2,
            NumberOfProvinces().findCircleNum(
                arrayOf(
                    intArrayOf(1,1,0),
                    intArrayOf(1,1,0),
                    intArrayOf(0,0,1)
                )
            )
        )
    }
}