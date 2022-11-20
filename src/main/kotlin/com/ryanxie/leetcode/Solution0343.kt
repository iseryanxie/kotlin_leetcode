package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * dynamic programming
 */
class Solution0343 {
    fun integerBreak(n: Int): Int {
        val dp = IntArray(n + 1)
        dp[1] = 1
        for (i in 2 until n + 1) {
            for (j in 1 until i) {
                // j * (i - j) is the case where we don't break i
                // j * dp[i - j] is the case where we break i at j
                // we want to maximize the product, so we take the max of these two cases, then take the max of all j
                dp[i] = maxOf(dp[i], j * (i - j), j * dp[i - j])
            }
        }
        return dp[n]
    }
}