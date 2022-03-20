package main.design

import org.junit.Test

import org.junit.Assert.*

class TicTacToeTest {

    @Test
    fun movePlayer2Wins() {
        val ticTacToe = TicTacToe(2)
        ticTacToe.move(0,0,2)
        ticTacToe.move(0,1,1)
        assertEquals(2, ticTacToe.move(1,1,2))
    }

    @Test
    fun movePlayer1Wins() {
        //["TicTacToe","move","move","move"]
        //[[2],[0,1,1],[1,1,2],[1,0,1]]
        val ticTacToe = TicTacToe(2)
        ticTacToe.move(0,1,1)
        ticTacToe.move(1,1,2)
        assertEquals(1, ticTacToe.move(1,0,1))
    }
}