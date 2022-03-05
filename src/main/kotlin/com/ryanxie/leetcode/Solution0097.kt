package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * use 2 dimensional dp + caching
 * start from end to beginning, if one of the current char equals to the s3 char, then return equals dp array of
 * of previous location
 */
class Solution0097 {
    fun isInterleave(s1: String, s2: String, s3: String): Boolean {
        if (s1.length + s2.length != s3.length) return false
        val dp = Array(s1.length + 1) { BooleanArray(s2.length + 1) }
        dp[s1.length][s2.length] = true // both s1 and s2 exhausted, s3 is exhausted too
        for (i in s1.length downTo 0) {
            for (j in s2.length downTo 0) {
                if (i == 1 && j == 0) {
                    println("i: $i, j: $j")
                }
                // branch on s1, only override if it's true
                if (i < s1.length && s1[i] == s3[i + j] && dp[i + 1][j]) dp[i][j] = true
                // branch on s2, only override if it's true
                if (j < s2.length && s2[j] == s3[i + j] && dp[i][j + 1]) dp[i][j] = true
            }
        }
        return dp[0][0]
    }
}