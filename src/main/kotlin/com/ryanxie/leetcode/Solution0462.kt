package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * The problem is equivalent to find the difference between each number and the median of the array.
 */
class Solution0462 {
    fun minMoves2(nums: IntArray): Int {
        nums.sort()
        val median = nums[nums.size / 2]
        var res = 0
        for (num in nums) {
            res += Math.abs(num - median)
        }
        return res
    }
}