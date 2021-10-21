package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class MinimumSwapsToSortTest{

    @Test
    fun testMinSwaps(){

        assertEquals(2, MinimumSwapsToSort().getMinSwapsToSort(intArrayOf(2,3,1,4,5)))
    }
}