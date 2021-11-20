package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class DecimalToBinaryTest {

    @Test
    fun testBinaryConverter(){

        assertEquals(
            "1101",
            DecimalToBinary().decimalToBinary(13)
        )
    }
}