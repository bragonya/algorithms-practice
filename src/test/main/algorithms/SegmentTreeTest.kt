package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class SegmentTreeTest {

    @Test
    fun testExample(){
        assertArrayEquals(
            intArrayOf(15,12,8,10),
            SegmentTree(intArrayOf(8,2,3,9,1)).solve(arrayOf(1..4, 2..3, 0..0, 0..1))
        )
    }


    @Test
    fun updateExample(){
        val tree = SegmentTree(intArrayOf(8,2,3,9,1))

        println(tree.segmentTreeL.map { it })
        tree.update(4, 2)
        assertArrayEquals(intArrayOf(24, 13, 11, 10, 3, 9, 2, 8, 2), tree.segmentTreeL)
    }
}