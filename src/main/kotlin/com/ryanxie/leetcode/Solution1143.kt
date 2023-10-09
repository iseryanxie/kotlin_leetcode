package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Stack as ArrayDeque
 */
class Solution1143 {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        val m = text1.length
        val n = text2.length
        // dp[i][j] is the longest common subsequence of text1[0..i-1] and text2[0..j-1]
        // all elements are initialized to 0
        val dp = Array(m + 1) { IntArray(n + 1) }
        for (m in 1..m) {
            for (n in 1..n) {
                dp[m][n] = if (text1[m - 1] == text2[n - 1]) {
                    // if there is a common char, then add 1 then solve the subproblem of moving both pointers
                    dp[m - 1][n - 1] + 1
                } else {
                    // not match, it is the max of moving either pointer
                    maxOf(dp[m - 1][n], dp[m][n - 1])
                }
            }
        }
        return dp[m][n]
    }
}