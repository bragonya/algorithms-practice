package main.algorithms

import org.junit.Test

import org.junit.Assert.*

class AtoiTest {

    @Test
    fun myAtoi() {

        assertEquals(
            -2147483648,
            Atoi().myAtoi("-91283472332")
        )
    }
}