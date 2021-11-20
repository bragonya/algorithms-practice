package main.algorithms

import org.junit.Test

import org.junit.Assert.*

class NQueensTest {

    @Test
    fun solveNQueens() {

        assertEquals(
            listOf(
                listOf(
                    ".Q..",
                    "...Q",
                    "Q...",
                    "..Q."
                ),
                listOf(
                    "..Q.",
                    "Q...",
                    "...Q",
                    ".Q.."
                )
            ),
            NQueens().solveNQueens(4)

            )

        print(NQueens().solveNQueens(4))
    }
}