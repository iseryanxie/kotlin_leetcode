package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0027 {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var right = nums.size - 1
        var left = 0
        while (left <= right) {
            if (nums[left] == `val`) {
                nums[left] = nums[right]
                right--
            } else {
                left++
            }
        }
        return left
    }
}