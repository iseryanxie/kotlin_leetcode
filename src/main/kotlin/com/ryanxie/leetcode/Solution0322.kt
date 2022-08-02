package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * DP, state is the amount of money
 */
class Solution0322 {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val dp = IntArray(amount + 1) { -1 }
        dp[0] = 0
        for (i in 1 until amount + 1) {
            for (coin in coins) {
                if (i - coin >= 0 && dp[i - coin] != -1) {
                    dp[i] = if (dp[i] == -1) dp[i - coin] + 1 else minOf(dp[i], dp[i - coin] + 1)
                }
            }
        }
        return dp[amount]
    }
}