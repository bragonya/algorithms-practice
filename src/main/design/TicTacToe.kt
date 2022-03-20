package main.design

//problem: https://leetcode.com/problems/design-tic-tac-toe
class TicTacToe(private val n: Int) {

    private val board = Array(n) { IntArray(n) }

    fun move(row: Int, col: Int, player: Int): Int {

        board[row][col] = player
        return if(validateRow(row, player)
            || validateColumn(col, player)
            || validateDiagonal(row, col, player)
            || validateInvertedDiagonal(row, col, player)
        ) player else 0
    }

    private fun validateRow(row: Int, player: Int): Boolean {

        for (i in board.indices) {
            if(board[row][i] != player) return false
        }

        return true
    }

    private fun validateColumn(column: Int, player: Int): Boolean {

        for (i in board.indices) {
            if(board[i][column] != player) return false
        }

        return true
    }

    private fun validateDiagonal(row: Int, column: Int, player: Int): Boolean {
        if(row != column) return false
        for (i in board.indices) {
            if(board[i][i] != player) return false
        }

        return true
    }

    private fun validateInvertedDiagonal(row: Int, column: Int, player: Int): Boolean {
        if(column != board.lastIndex - row) return false
        for (i in board.indices) {
            if(board[i][board.lastIndex - i] != player) return false
        }

        return true
    }
}