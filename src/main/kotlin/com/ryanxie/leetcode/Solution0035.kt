package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0035 {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = -1
        var right = nums.size
        while (left+1 < right) {
            val mid = (left + right) / 2
            if (target == nums[mid]) {
                return mid
            } else if (target < nums[mid]) {
                right = mid
            } else{
                left = mid
            }
        }
        return right
    }
}