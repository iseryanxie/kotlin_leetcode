package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0026 {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        var lastIdx = 1
        var lastVal = nums[0]
        nums.forEachIndexed { i, _ ->
            if (nums[i] > lastVal) {
                lastVal = nums[i]
                nums[lastIdx] = lastVal
                lastIdx++
            }
        }
        return lastIdx
    }
}