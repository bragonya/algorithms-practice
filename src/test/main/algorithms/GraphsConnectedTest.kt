package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class GraphsConnectedTest {

    @Test
    fun testNumberOfGraphs() {
        assertEquals(
            2,
            GraphsConnected().getNumberOfConnections(arrayOf(intArrayOf(0,1), intArrayOf(1,2), intArrayOf(3,4)))
        )
    }

    @Test
    fun testNumberOfGraphs2() {
        assertEquals(
            1,
            GraphsConnected().getNumberOfConnections(arrayOf(intArrayOf(0,1), intArrayOf(1,2), intArrayOf(3,4), intArrayOf(4, 0)))
        )
    }

    @Test
    fun testNumberOfGraphs4Graphs() {
        assertEquals(
            4,
            GraphsConnected().getNumberOfConnections(
                arrayOf(
                    intArrayOf(0,1),
                    intArrayOf(1,2),
                    intArrayOf(3,4),
                    intArrayOf(4, 0),
                    intArrayOf(8, 15),
                    intArrayOf(13, 44),
                    intArrayOf(41, 55),
                    intArrayOf(11, 15)
                )
            )
        )
    }

    @Test
    fun testNumberOfGraphsSmallOneGraph() {
        assertEquals(
            1,
            GraphsConnected().getNumberOfConnections(
                arrayOf(
                    intArrayOf(0,1),
                    intArrayOf(1,2),
                    intArrayOf(2,3),
                    intArrayOf(3, 4)
                )
            )
        )
    }
}