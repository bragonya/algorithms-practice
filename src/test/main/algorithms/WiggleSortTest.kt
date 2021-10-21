package main.algorithms

import org.junit.Test

import org.junit.Assert.*

class WiggleSortTest {

    @Test
    fun wiggleSort() {
        assertArrayEquals(
            intArrayOf(1,5,1,6,1,4),
            WiggleSort().wiggleSort(intArrayOf(1,5,1,1,6,4))
        )
    }

    @Test
    fun wiggleSort2() {
        assertArrayEquals(
            intArrayOf(1,3,2,3,1,2),
            WiggleSort().wiggleSort(intArrayOf(1,3,2,2,3,1))
        )
    }
}