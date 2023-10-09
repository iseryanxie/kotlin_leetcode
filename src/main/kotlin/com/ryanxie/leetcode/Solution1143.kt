package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Stack as ArrayDeque
 */
class Solution1143 {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        val m = text1.length
        val n = text2.length
        val dp = Array(m + 1) { IntArray(n + 1) }
        for (m in 1..m) {
            for (n in 1..n) {
                dp[m][n] = if (text1[m - 1] == text2[n - 1]) {
                    dp[m - 1][n - 1] + 1
                } else {
                    maxOf(dp[m - 1][n], dp[m][n - 1])
                }
            }
        }
        return dp[m][n]
    }
}