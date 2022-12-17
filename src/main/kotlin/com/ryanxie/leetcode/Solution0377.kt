package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0377 {
    fun combinationSum4(nums: IntArray, target: Int): Int {
        val dp = IntArray(target + 1)
        dp[0] = 1
        for (i in 1..target) {
            for (num in nums) {
                if (i >= num) {
                    dp[i] += dp[i - num]
                }
            }
        }
        return dp[target]
    }
}