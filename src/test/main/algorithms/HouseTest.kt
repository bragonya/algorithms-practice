package main.algorithms

import org.junit.Test

import org.junit.Assert.*

class HouseTest {

    @Test
    fun testGetPositions() {

        val beforeTime = System.currentTimeMillis()
        val positions = House().getPositions(intArrayOf(1,3,2,1,4,1,3,2,1,1,2), 8)
        val timeItTakes = System.currentTimeMillis() - beforeTime
        println(timeItTakes)
        assertEquals(
            listOf(
                2 to 5,
                4 to 6,
                5 to 9
            ),
            positions
        )
    }

    @Test
    fun testGetPositionsWithPrefix() {

        val beforeTime = System.currentTimeMillis()
        val positions = House().getPositionsWithPrefixSUm(intArrayOf(1,3,2,1,4,1,3,2,1,1,2), 8)
        val timeItTakes = System.currentTimeMillis() - beforeTime
        println(timeItTakes)
        assertEquals(
            listOf(
                2 to 5,
                4 to 6,
                5 to 9
            ),
            positions
        )
    }
}