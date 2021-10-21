package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class ParkingDilemmaKtTest {

    @Test
    fun testRoofForCars(){

        assertEquals(
            9,
            ParkingDilemma().getMinLengthOfRoof(intArrayOf(2, 10, 8, 17), 3)
        )
    }
}