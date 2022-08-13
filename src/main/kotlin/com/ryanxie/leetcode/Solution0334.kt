package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Greedy
 */
class Solution0334 {
    fun increasingTriplet(nums: IntArray): Boolean {
        if (nums.size < 3) return false
        // first is the smallest, second is the second smallest
        var first = Int.MAX_VALUE
        var second = Int.MAX_VALUE
        for (num in nums) {
            if (num <= first) {
                // always try to update the smallest one first
                first = num
            } else if (num <= second) {
                second = num
            } else {
                // when we find a number larger than first and second, we have a triplet
                return true
            }
        }
        return false
    }
}