package main.algorithms

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class MaxProfitTest {

    @Test
    fun solve() {

        assertEquals(
            16,
            MaxProfit().solve(intArrayOf(1, 5, 1, 3, 7, -3), 2)
        )


        // 2,4,5 - 7,0,1
        assertEquals(
            48,
            MaxProfit().solve(intArrayOf(10, 5, 11, 1, 7, 13, 1, 12), 3)
        )

    }

    @Test
    fun shortCase(){
        assertEquals(
            -2,
            MaxProfit().solve(intArrayOf(3, -5), 1)
        )
    }
}