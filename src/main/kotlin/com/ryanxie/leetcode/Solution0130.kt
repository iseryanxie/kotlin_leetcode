package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * capture surrended region <=> capture everything except the unsurrended region
 * dfs on the unsurrended cells
 */
class Solution0130 {
    fun solve(board: Array<CharArray>): Unit {
        val numRows = board.size
        val numCols = board[0].size
        // 1. capture unsurrended region (O->T)
        for (row in 0 until numRows) {
            for (col in 0 until numCols) {
                if (board[row][col] == 'O' && (row == 0 || row == numRows - 1 || col == 0 || col == numCols - 1)) {
                    capture(board, row, col, numRows, numCols)
                }
            }
        }

        // 2. capture surrended regions (O -> X)
        for (row in 0 until numRows) {
            for (col in 0 until numCols) {
                if (board[row][col] == 'O') {
                    board[row][col] = 'X'
                }
            }
        }

        // 3. uncapture unsurrended regions (T -> O)
        for (row in 0 until numRows) {
            for (col in 0 until numCols) {
                if (board[row][col] == 'T') {
                    board[row][col] = 'O'
                }
            }
        }

    }

    private fun capture(board: Array<CharArray>, row: Int, col: Int, numRows: Int, numCols: Int) {
        if (row < 0 || row >= numRows || col < 0 || col >= numCols) {
            return
        }
        if (board[row][col] == 'O') {
            board[row][col] = 'T'
            capture(board, row - 1, col, numRows, numCols)
            capture(board, row + 1, col, numRows, numCols)
            capture(board, row, col - 1, numRows, numCols)
            capture(board, row, col + 1, numRows, numCols)
        }
    }
}