package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0162 {
    fun findPeakElement(nums: IntArray): Int {
        if (nums.size == 1) {
            return 0
        }
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            val mid = left + (right - left) / 2
            if (nums[mid] > nums[mid + 1]) {
                // must have a peak on the left
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left
    }
}