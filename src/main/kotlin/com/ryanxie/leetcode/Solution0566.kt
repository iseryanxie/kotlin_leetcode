package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0566 {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        val orig_r = mat.size
        val orig_c = mat[0].size
        if (orig_r * orig_c != r * c) {
            return mat
        }
        val result = Array(r) { IntArray(c) }
        var col = 0
        var row = 0
        for (i in 0 until r) {
            for (j in 0 until c) {
                result[i][j] = mat[row][col]
                col++
                if (col == orig_c) {
                    col = 0
                    row++
                }
            }
        }
        return result
    }
}