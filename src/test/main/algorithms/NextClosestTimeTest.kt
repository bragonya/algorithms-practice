package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class NextClosestTimeTest{

    @Test
    fun testBaseCase(){
        assertEquals(
            "15:11",
            NextClosestTime().solveNextClosestTime("11:59")
        )
        assertEquals(
            "11:21",
            NextClosestTime().solveNextClosestTime("11:20")
        )

        assertEquals(
            "11:11",
            NextClosestTime().solveNextClosestTime("19:59")
        )

        assertEquals(
            "22:22",
            NextClosestTime().solveNextClosestTime("23:59" +
                    "")
        )

    }
}