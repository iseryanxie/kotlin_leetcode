package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0486 {
    fun predictTheWinner(nums: IntArray): Boolean {
        val n = nums.size
        // dp[i][j] means the score difference between the current player and the other player
        val dp = Array(n) { IntArray(n) }
        for (i in 0 until n) {
            dp[i][i] = nums[i]
        }
        for (i in n - 2 downTo 0) {
            for (j in i + 1 until n) {
                // the first player can choose nums[i] or nums[j]
                // if the first player chooses nums[i], the score difference of the next player is dp[i + 1][j]
                // so the score difference of the current player is nums[i] - dp[i + 1][j]
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1])
            }
        }
        // if the score difference is greater than or equal to 0, the first player wins
        return dp[0][n - 1] >= 0
    }
}