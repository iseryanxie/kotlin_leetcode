package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * DP, dp[m], state is minimum number of coins needed to get m
 */
class Solution0322 {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val dp = IntArray(amount + 1) { -1 }
        dp[0] = 0
        for (i in 1 until amount + 1) {
            for (coin in coins) {
                if (i - coin >= 0 && dp[i - coin] != -1) {
                    // if dpi[i] is not initialized, then the min is to use the coin and start from i-coin, dp[i - coin] + 1
                    dp[i] = if (dp[i] == -1) dp[i - coin] + 1 else minOf(dp[i], dp[i - coin] + 1)
                }
            }
        }
        return dp[amount]
    }
}