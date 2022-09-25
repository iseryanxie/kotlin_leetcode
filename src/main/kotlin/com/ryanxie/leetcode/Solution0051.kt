package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0051 {
    fun solveNQueens(n: Int): List<List<String>> {
        val colSet = mutableSetOf<Int>()
        val diagSet = mutableSetOf<Int>()
        val antiDiagSet = mutableSetOf<Int>()
        val result = mutableListOf<List<String>>()
        val board = Array(n) { CharArray(n) { '.' } }
        dfs(0, n, colSet, diagSet, antiDiagSet, board, result)
        return result
    }
    fun dfs(row: Int, n: Int, colSet: MutableSet<Int>, diagSet: MutableSet<Int>, antiDiagSet: MutableSet<Int>, board: Array<CharArray>, result: MutableList<List<String>>) {
        if (row == n) {
            result.add(board.map { it.joinToString("") })
            return
        }
        for (col in 0 until n) {
            if (colSet.contains(col) || diagSet.contains(row + col) || antiDiagSet.contains(row - col)) {
                continue
            }
            colSet.add(col)
            diagSet.add(row + col)
            antiDiagSet.add(row - col)
            board[row][col] = 'Q'
            dfs(row + 1, n, colSet, diagSet, antiDiagSet, board, result)
            board[row][col] = '.'
            colSet.remove(col)
            diagSet.remove(row + col)
            antiDiagSet.remove(row - col)
        }
    }
//    fun solveNQueens(n: Int): List<List<String>> {
//        val result = mutableListOf<List<String>>()
//        val board = Array(n) { CharArray(n) { '.' } }
//        solveNQueens(board, 0, result)
//        return result
//    }
//    private fun solveNQueens(board: Array<CharArray>, row: Int, result: MutableList<List<String>>) {
//        if (row == board.size) {
//            result.add(board.map { it.joinToString("") })
//            return
//        }
//        for (col in board.indices) {
//            if (isValid(board, row, col)) {
//                board[row][col] = 'Q'
//                solveNQueens(board, row + 1, result) // move to next row
//                board[row][col] = '.'
//            }
//        }
//    }
//    private fun isValid(board: Array<CharArray>, row: Int, col: Int): Boolean {
//        for (i in 0 until row) {
//            if (board[i][col] == 'Q') return false
//        }
//        var i = row - 1
//        var j = col - 1
//        while (i >= 0 && j >= 0) {
//            if (board[i][j] == 'Q') return false
//            i--
//            j--
//        }
//        i = row - 1
//        j = col + 1
//        while (i >= 0 && j < board.size) {
//            if (board[i][j] == 'Q') return false
//            i--
//            j++
//        }
//        return true
//    }
}