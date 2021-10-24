package main.algorithms

import org.junit.Test

import org.junit.Assert.*

class KthLargestElementTest {

    @Test
    fun testFindLargestElement() {

        assertEquals(
            6,
            KthLargestElement().findKthLargest(intArrayOf(3,2,1,5,6,4), k = 1)
        )
        assertEquals(
            4,
            KthLargestElement().findKthLargest(intArrayOf(3,2,1,5,6,4), k = 3)
        )

        assertEquals(
            6,
            KthLargestElement().findKthLargest(intArrayOf(3,6,1,5,2,4), k = 1)
        )

        assertEquals(
            4,
            KthLargestElement().findKthLargest(intArrayOf(3,6,1,5,2,4), k = 3)
        )

        assertEquals(
            6,
            KthLargestElement().findKthLargest(intArrayOf(3,6,4,3,1,5,2,4), k = 1)
        )

        assertEquals(
            -1,
            KthLargestElement().findKthLargest(intArrayOf(-1,-1), k = 2)
        )
    }

    @Test
    fun testfindLargestElementNegative() {

        assertEquals(
            -1,
            KthLargestElement().findKthLargest(intArrayOf(-1,-1), k = 2)
        )
    }
}