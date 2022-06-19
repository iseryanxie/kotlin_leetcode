package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0213 {
    // helper is the same as rob one without circle
    fun helper(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums[0]
        if (nums.size == 2) return maxOf(nums[0], nums[1])
        val dp = IntArray(nums.size)
        dp[0] = nums[0]
        dp[1] = maxOf(nums[0], nums[1])
        for (i in 2 until nums.size) {
            // whether to rob current house or not
            dp[i] = maxOf(dp[i - 2] + nums[i], dp[i - 1])
        }
        return dp[nums.size - 1]
    }

    fun rob(nums: IntArray): Int {
        val rob1 = helper(nums.take(nums.size - 1).toIntArray())
        val rob2 = helper(nums.takeLast(nums.size - 1).toIntArray())
        return maxOf(rob1, rob2, nums[0])
    }
}