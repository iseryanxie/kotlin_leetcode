package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0474 {
    fun findMaxForm(strs: Array<String>, m: Int, n: Int): Int {
        // dp is a 2D array, dp[i][j] means the max number of strings that can be formed with i 0's and j 1's
        val dp = Array(m + 1) { IntArray(n + 1) }
        for (str in strs) {
            val zeros = str.count { it == '0' }
            val ones = str.length - zeros
            for (i in m downTo zeros) {
                for (j in n downTo ones) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeros][j - ones] + 1)
                }
            }
        }
        return dp[m][n]

    }
}