package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0072 {
    fun minDistance(word1: String, word2: String): Int {
        val m = word1.length
        val n = word2.length
        // dp[i][j] represents the minimum number of operations to convert word1[0..i) to word2[0..j)
        // use a 2D array of (m+1, n+1) to represent the dp table, with extra column and row for base case of empty string
        val dp = Array(m + 1) { IntArray(n + 1) }
        for (i in 0..m) {
            // base case: word1 is empty
            dp[i][0] = i
        }
        for (j in 0..n) {
            // base case: word2 is empty
            dp[0][j] = j
        }
        for (i in 1..m) {
            for (j in 1..n) {
                if (word1[i - 1] == word2[j - 1]) {
                    // characters are the same, no operation needed
                    dp[i][j] = dp[i - 1][j - 1]
                } else {
                    // if characters are different, we can either insert, delete or replace
                    // when insert, we need to convert word1[0..i) to word2[0..j-1) and then insert word2[j-1] to the end
                    val insert = dp[i][j - 1] + 1
                    // when delete, we need to convert word1[0..i-1) to word2[0..j) and then delete word1[i-1]
                    val delete = dp[i - 1][j] + 1
                    // when replace, we need to convert word1[0..i-1) to word2[0..j-1) and then replace word1[i-1] with word2[j-1]
                    val replace = dp[i - 1][j - 1] + 1
                    // we choose the minimum number of operations
                    dp[i][j] = Math.min(Math.min(insert, delete), replace)
                }
            }
        }
        return dp[m][n]

    }
}
