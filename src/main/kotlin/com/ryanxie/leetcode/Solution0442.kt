package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0442 {
    fun findDuplicates(nums: IntArray): List<Int> {
        val result = mutableListOf<Int>()
        for (i in nums.indices) {
            // put the number to the index of the nums array
            val index = Math.abs(nums[i]) - 1
            if (nums[index] < 0) {
                // if the number is already negative, it means we have seen it before
                result.add(Math.abs(nums[i]))
            } else {
                // mark the number as negative
                nums[index] = -nums[index]
            }
        }
        return result
    }
}