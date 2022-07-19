package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0279 {
    fun numSquares(n: Int): Int {
        val dp = Array(n + 1) { Int.MAX_VALUE }
        dp[0] = 0
        for (i in 1 until n + 1) {
            var j = 1
            while (i - j * j >= 0) {
                dp[i] = minOf(dp[i], dp[i - j * j] + 1)
                j++
            }
        }
        return dp[n]
    }
}