package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Complexity: O(n**2)
 * DP: lis[i] to represent the length of increasing subsequence if we start from index i
 */
class Solution0300 {
    fun lengthOfLIS(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        val lis = IntArray(nums.size) { 1 } // each position can be a subsequence of itself
        for (i in nums.size - 1 downTo 0) { // from end to beginning
            for (j in i + 1 until nums.size) { // for every position after i
                if (nums[i] < nums[j]) { // as long as i is less than j
                    // update lis[i] as max of
                    // start from index i, the length of increasing subsequence
                    // OR choose i then another increasing subsequence starting from index j
                    // so we compared every path becasue j is looped over all the paths after i
                    lis[i] = Math.max(lis[i], lis[j] + 1)
                }
            }
        }

        return lis.maxOrNull() ?: 0
    }
}