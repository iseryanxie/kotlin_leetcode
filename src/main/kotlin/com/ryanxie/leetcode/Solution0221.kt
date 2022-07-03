package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0221 {
    fun maximalSquare(matrix: Array<CharArray>): Int {
        if (matrix.isEmpty()) return 0
        val m = matrix.size
        val n = matrix[0].size
        val dp = Array(m) { IntArray(n) { 0 } }
        var max = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        // if top or left-most, then you can only be 1
                        dp[i][j] = 1
                    } else {
                        // only if left, up and left-up are 1, then current element can become 2
                        // e.g.,
                        // 1,1
                        // 1,2
                        // because, the bottom-right element can now has a square of 2
                        // so take the min of all three sides, then increment by 1
                        dp[i][j] = minOf(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1]) + 1
                    }
                    max = maxOf(max, dp[i][j])
                }
            }
        }
        return max * max
    }
}