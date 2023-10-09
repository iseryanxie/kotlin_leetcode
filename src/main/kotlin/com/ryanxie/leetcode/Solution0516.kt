package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Solve the longest common subsequence problem 1143 with reversed string will return the longest palindrome subsequence
 */
class Solution0516 {
    fun longestPalindromeSubseq(s: String): Int {
        val n = s.length
        val reversed = s.reversed()
        val dp = Array(n + 1) { IntArray(n + 1) }
        for (i in 1..n) {
            for (j in 1..n) {
                // if match, add 1 to the previous result
                dp[i][j] = if (s[i - 1] == reversed[j - 1]) {
                    dp[i - 1][j - 1] + 1
                } else {
                    // if not match, take the max of the previous result
                    maxOf(dp[i - 1][j], dp[i][j - 1])
                }
            }
        }
        return dp[n][n]
    }
}