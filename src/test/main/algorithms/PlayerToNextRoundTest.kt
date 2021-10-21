package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class PlayerToNextRoundTest{

    @Test
    fun testPlayersNextRound(){
        assertEquals(
            6,
            PlayerToNextRound().numOfPlayers(intArrayOf(5, 10, 10, 20, 20, 20, 60, 80, 100), 4)
        )
        assertEquals(
            7,
            PlayerToNextRound().numOfPlayers(intArrayOf(10, 10, 10, 10, 20, 20, 20), 7)
        )

        assertEquals(
            3,
            PlayerToNextRound().numOfPlayers(intArrayOf(10, 10, 10, 10, 20, 20, 20), 1)
        )

        assertEquals(
            0,
            PlayerToNextRound().numOfPlayers(intArrayOf(10, 10, 10, 10, 20, 20, 20), 0)
        )

        assertEquals(
            2,
            PlayerToNextRound().numOfPlayers(intArrayOf(20, 20, 10, 10, 10, 10), 1)
        )

        assertEquals(
            3,
            PlayerToNextRound().numOfPlayers(intArrayOf(10, 20, 20, 15, 20, 10), 1)
        )
    }
}