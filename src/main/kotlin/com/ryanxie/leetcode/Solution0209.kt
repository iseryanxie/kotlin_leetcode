package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * use two pointers to compute sliding window
 */
class Solution0209 {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var minLen = Int.MAX_VALUE
        var left = 0
        var right = 0
        var sum = 0
        // move right pointer till out of bound
        while (right < nums.size) {
            // sum from left to right
            sum += nums[right]
            while (sum >= target) {
                // when sum is greater than target, keep move left pointer
                minLen = minOf(minLen, right - left + 1)
                sum -= nums[left]
                left++
            }
            right++
        }
        return if (minLen == Int.MAX_VALUE) 0 else minLen
    }
}