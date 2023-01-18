package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0674 {
    fun findLengthOfLCIS(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var max = 1
        var count = 1
        for (i in 1 until nums.size){
            if (nums[i] > nums[i-1]){
                count++
            } else {
                count = 1
            }
            max = Math.max(max, count)
        }
        return max
    }
}