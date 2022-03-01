package main.algorithms

import org.junit.Test

import org.junit.Assert.*

class ZigZagConversionTest {

    @Test
    fun convert() {

        assertEquals(
            "PAHNAPLSIIGYIR",
            ZigZagConversion().convert("PAYPALISHIRING", 3)
        )

        assertEquals(
            "PINALSIGYAHRPI",
            ZigZagConversion().convert("PAYPALISHIRING", 4)
        )

        assertEquals(
            "ABCDE",
            ZigZagConversion().convert("ABCDE", 5)
        )

        assertEquals(
            "ABCDFE",
            ZigZagConversion().convert("ABCDEF", 5)
        )

    }
}