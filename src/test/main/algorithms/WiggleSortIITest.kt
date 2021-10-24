package main.algorithms

import org.junit.Test

import org.junit.Assert.*
import java.lang.AssertionError

class WiggleSortIITest {

    @Test
    fun wiggleSort() {
        assertWaggle(
            WiggleSortII().wiggleSort(intArrayOf(1,5,1,1,6,4))
        )
    }

    @Test
    fun wiggleSort2() {
        assertWaggle(
            WiggleSortII().wiggleSort(intArrayOf(1,3,2,2,3,1))
        )
    }

    @Test
    fun wiggleSort3() {
        assertWaggle(
            WiggleSortII().wiggleSort(intArrayOf(1,5,1,1,6,4))
        )
    }

    @Test
    fun testWiggleSort4() {
        assertWaggle(
            WiggleSortII().wiggleSort(intArrayOf(4,5,5,6))
        )
    }

    private fun assertWaggle(nums: IntArray) {
        var previous = Int.MAX_VALUE
        nums.forEachIndexed { index, item ->
            if(index % 2 == 0) {
                if (item >= previous) throw AssertionError()
                previous = item
            }else{
                if (item <= previous) throw AssertionError()
                previous = item
            }
        }
    }
}