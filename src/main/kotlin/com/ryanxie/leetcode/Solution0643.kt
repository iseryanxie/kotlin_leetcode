package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0643 {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = 0
        for (i in 0 until k) {
            sum += nums[i]
        }
        var max = sum
        for (i in k until nums.size) {
            sum += nums[i] - nums[i - k]
            max = Math.max(max, sum)
        }
        return max.toDouble() / k
    }
}