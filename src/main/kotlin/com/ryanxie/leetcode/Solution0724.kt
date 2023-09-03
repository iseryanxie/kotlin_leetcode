package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0724 {
    fun pivotIndex(nums: IntArray): Int {
        val sum = nums.sum()
        var leftSum = 0
        for (i in nums.indices) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i
            }
            leftSum += nums[i]
        }
        return -1
    }
}