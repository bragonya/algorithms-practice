package main

import org.junit.Test

import org.junit.Assert.*

class CountSmallerTest {

    @Test
    fun solve() {
        assertArrayEquals(
            intArrayOf(2,1,1,0),
            CountSmaller().solve(intArrayOf(5, 2, 6, 1))
        )

        assertArrayEquals(
            intArrayOf(4,4,0,0,1,0),
            CountSmaller().solve(intArrayOf(5,6,-1,-1,2,1))
        )

        assertArrayEquals(
            intArrayOf(3,3,0,1,0),
            CountSmaller().solve(intArrayOf(5, 6, 1, 3, 1))
        )
    }
}