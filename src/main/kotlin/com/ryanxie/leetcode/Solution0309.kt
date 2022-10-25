package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0309 {
    fun maxProfit(prices: IntArray): Int {
        // state: time i and can buy or not
        // if buy -> i + 1
        // if sell -> i + 2
        // dp caches the max profit at state (i, state)
        val dp: MutableMap<Pair<Int, Boolean>, Int> = mutableMapOf()
        fun dfs(i: Int, canBuy: Boolean): Int {
            if (i >= prices.size) return 0
            val key = Pair(i, canBuy)
            if (dp.containsKey(key)) return dp[key]!!
            val coolDownProfit = dfs(i + 1, canBuy)
            val result = if (canBuy) {
                val buyProfit = dfs(i + 1, false) - prices[i]
                maxOf(buyProfit, coolDownProfit)
            } else {
                val sellProfit = dfs(i + 2, true) + prices[i]
                maxOf(sellProfit, coolDownProfit)
            }
            dp[key] = result
            return result
        }
        return dfs(0, true)
    }
}