package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0153 {
    fun findMin(nums: IntArray): Int {
        var start = 0
        var end = nums.size - 1
        while (start <= end) {
            // left is always greater than the last element, except at the minimum number
            // e.g., 3,4,5,1,2
            if (nums[start] <= nums[end]) return nums[start]
            val mid: Int = start + (end - start) / 2
            val midValue = nums[mid]
            if (midValue >= nums[start]) {
                // this means mid point is to the left of the min point, move left to mid
                start = mid
            } else {
                end = mid
            }
            start ++
        }
        return -1
    }
}