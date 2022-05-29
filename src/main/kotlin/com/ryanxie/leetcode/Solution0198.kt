package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0198 {
    fun rob(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums[0]
        if (nums.size == 2) return maxOf(nums[0], nums[1])
        val dp = IntArray(nums.size)
        dp[0] = nums[0]
        dp[1] = maxOf(nums[0], nums[1])
        for (i in 2 until nums.size) {
            // whether to rob current house or not
            dp[i] = maxOf(dp[i-2] + nums[i], dp[i-1])
        }
        return dp[nums.size - 1]
    }
}