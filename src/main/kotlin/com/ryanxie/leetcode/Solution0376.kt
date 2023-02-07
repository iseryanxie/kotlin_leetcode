package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * O(n) time, O(1) space
 * one scan to record at every change of sign
 */
class Solution0376 {
    fun wiggleMaxLength(nums: IntArray): Int {
        if (nums.size < 2) return nums.size
        var prevdiff = 0
        var max = 1
        for (i in 1 until nums.size) {
            val diff = nums[i] - nums[i - 1]
            if (diff > 0 && prevdiff <= 0 || diff < 0 && prevdiff >= 0) {
                // if diff changes sign, we have a new wiggle
                max++
                // update prevdiff
                prevdiff = diff
            }
        }
        return max
    }
}