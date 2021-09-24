package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class ContainerWithMostWaterTest{

    @Test
    fun testContainer(){
        assertEquals(
            49,
            ContainerWithMostWater().maxArea(intArrayOf(1,8,6,2,5,4,8,3,7))
        )
    }

    @Test
    fun testContainerTwoElements(){
        assertEquals(
            1,
            ContainerWithMostWater().maxArea(intArrayOf(1,1))
        )
    }
}