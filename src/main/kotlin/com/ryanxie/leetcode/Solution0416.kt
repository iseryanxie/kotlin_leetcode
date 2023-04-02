package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * check if any subset can achieve sum/2
 */
class Solution0416 {
    fun canPartition(nums: IntArray): Boolean {
        val sum = nums.sum()
        if (sum % 2 != 0) return false
        val target = sum / 2
        // dp[i] = true if there is a subset of nums that sums to i
        val dp = BooleanArray(target + 1)
        dp[0] = true
        for (num in nums) {
            for (i in target downTo num) {
                dp[i] = dp[i] || dp[i - num]
            }
        }
        return dp[target]
    }
}