package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0368 {
    fun largestDivisibleSubset(nums: IntArray): List<Int> {
        if (nums.isEmpty()) return emptyList()
        nums.sort()
        val dp = IntArray(nums.size) { 1 }
        val prev = IntArray(nums.size) { -1 } // -1 is the dummy first element
        // each number is divisible by itself
        // dp[i] the largest divisible subset ending with nums[i]
        for (i in 1 until nums.size) {
            for (j in 0 until i) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = (dp[j] + 1).coerceAtLeast(dp[i])
                    if (dp[i] == dp[j] + 1) {
                        prev[i] = j
                    } // record the previous index for quickly restore the path
                }
            }
        }
        // find the largest subset
        var maxIndex = 0
        for (i in 1 until nums.size) {
            if (dp[i] > dp[maxIndex]) maxIndex = i
        }
        // restore the path
        val result = mutableListOf<Int>()
        var i = maxIndex
        while (i != -1) {
            result.add(nums[i])
            i = prev[i]
        }
        return result
    }
}