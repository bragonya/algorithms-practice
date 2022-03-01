package main.algorithms

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class CrackingTheSafeTest {

    @Test
    fun basicTest(){


        assertEquals(
            "0011220210",
            CrackingTheSafe().crackSafe(2, 3)
        )

        assertEquals(
            "00110",
            CrackingTheSafe().crackSafe(2, 2)
        )

        assertEquals(
            "01",
            CrackingTheSafe().crackSafe(1, 2)
        )

        assertEquals(
            "0",
            CrackingTheSafe().crackSafe(1, 1)
        )
    }
}