package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0375 {
    fun getMoneyAmount(n: Int): Int {
        // use dp to represent the minimum cost to guess from i to j
        val dp = Array(n + 1) { IntArray(n + 1) }
        for (i in n downTo 1) {
            for (j in i + 1..n) {
                var min = Int.MAX_VALUE
                // for all k between [i,j), guess k
                for (k in i until j) {
                    // cost of guessing k is k+max(left, right), worst case cost
                    val tmp = k + maxOf(dp[i][k - 1], dp[k + 1][j])
                    // find the minimum of the worst cases
                    min = minOf(min, tmp)
                }
                dp[i][j] = if (i == j) 0 else min
            }
        }
        return dp[1][n]
    }
}