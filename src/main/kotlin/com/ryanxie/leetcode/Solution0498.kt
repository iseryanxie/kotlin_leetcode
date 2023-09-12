package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0498 {
    fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
        val m = mat.size
        val n = mat[0].size
        val result = IntArray(m * n)
        var i = 0
        var j = 0
        var k = 0
        var up = true
        while (k < m * n) {
            // visit the current element
            result[k] = mat[i][j]
            if (up) { // need to go up for next element
                if (i == 0 && j < n - 1) {
                    // move right once
                    j++
                    // change direction
                    up = false
                } else if (j == n - 1) {
                    // reached the right edge, go down
                    i++
                    up = false
                } else {
                    i--
                    j++
                }
            } else {
                if (j == 0 && i < m - 1) {
                    i++
                    up = true
                } else if (i == m - 1) {
                    j++
                    up = true
                } else {
                    i++
                    j--
                }
            }
            k++
        }
        return result

    }
}