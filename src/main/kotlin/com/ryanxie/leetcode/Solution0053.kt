package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0053 {
    fun maxSubArray(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        var maxSum = nums[0]
        var dpSum = nums[0]
        for (i in 1 until nums.size) {
            dpSum = kotlin.math.max(dpSum + nums[i], nums[i])
            maxSum = kotlin.math.max(dpSum, maxSum)
        }
        return maxSum
    }
}