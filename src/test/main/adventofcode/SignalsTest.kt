package main.adventofcode

import org.junit.Assert.*
import org.junit.Test

class SignalsTest {


    @Test
    fun testSignals(){
        val input = mutableListOf<Int>().fillWithFile("./src/assets/BasicInputDay1")

        assertEquals(
            7,
            Signals().solve(input)
        )

    }

    @Test
    fun testSignalsPart2(){
        val input = mutableListOf<Int>().fillWithFile("./src/assets/BasicInputDay1")

        assertEquals(
            5,
            Signals().solvePart2(input)
        )

    }

    @Test
    fun testSignalsComplex(){
        val input = mutableListOf<Int>().fillWithFile("./src/assets/SignalsDay1AdventOfCode")

        println(Signals().solve(input))
        println(Signals().solvePart2(input))

    }
}