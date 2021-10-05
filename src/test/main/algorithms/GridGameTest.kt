package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class GridGameTest {


    @Test
    fun testBasicGridGame(){

        assertEquals(
            4,
            GridGame().solution(
                arrayOf(
                intArrayOf(2,5,4),
                intArrayOf(1,5,1)
            )
            )
        )
    }

    @Test
    fun testComplexGridGame(){

        assertEquals(
            63,
            GridGame().solution(
                arrayOf(
                    intArrayOf(20,3,20,17,2,12,15,17,4,15),
                    intArrayOf(20,10,13,14,15,5,2,3,14,3)
                )
            )
        )
    }

    @Test
    fun testComplexGridGame2(){

        assertEquals(
            63,
            GridGame().solution2(
                arrayOf(
                    longArrayOf(20,3,20,17,2,12,15,17,4,15),
                    longArrayOf(20,10,13,14,15,5,2,3,14,3)
                )
            )
        )
    }
}