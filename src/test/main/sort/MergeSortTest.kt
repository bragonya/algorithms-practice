package main.sort

import org.junit.Test

import org.junit.Assert.*

class MergeSortTest {

    @Test
    fun sort() {

        assertArrayEquals(
            intArrayOf(1,2,3,4,5,6,7),
            MergeSort().sort(intArrayOf(7,6,5,4,3,2,1))
        )
    }
}