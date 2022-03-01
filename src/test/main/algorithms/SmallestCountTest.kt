package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class SmallestCountTest{
    @Test
    fun basicTest(){
        val resolution = SmallestCount()

        println(resolution.countSmaller(intArrayOf(5,2,6,1)))
    }
}