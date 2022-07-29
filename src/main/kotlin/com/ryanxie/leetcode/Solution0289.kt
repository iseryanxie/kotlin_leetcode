package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0289 {
    fun gameOfLife(board: Array<IntArray>): Unit {
        if (board.isEmpty()) return
        val m = board.size
        val n = board[0].size
        val next = Array(m) { IntArray(n) { 0 } }
        for (i in 0 until m) {
            for (j in 0 until n) {
                val count = countNeighbors(board, i, j)
                if (board[i][j] == 1) {
                    if (count < 2 || count > 3) next[i][j] = 0
                    else next[i][j] = 1
                } else {
                    if (count == 3) next[i][j] = 1
                    else next[i][j] = 0
                }
            }
        }
        for (i in 0 until m) {
            for (j in 0 until n) {
                board[i][j] = next[i][j]
            }
        }
    }

    fun countNeighbors(board: Array<IntArray>, i: Int, j: Int): Int {
        var count = 0
        for (x in i - 1..i + 1) {
            for (y in j - 1..j + 1) {
                if (x == i && y == j) continue
                if (x < 0 || x >= board.size) continue
                if (y < 0 || y >= board[0].size) continue
                if (board[x][y] == 1) count++
            }
        }
        return count
    }
}