package com.ryanxie.leetcode

/**
 * 4  - 0 1 0 0
 * 14 - 1 1 1 0
 * 2  - 0 0 1 0
 * -------------
 * 1 bit count = 1 2 2 0
 * 0 bit count = 2 1 1 3 (nums.size - 1'bit count)
 *
 * Total Sum = (no. of 1bit * no. of 0bit) + .... (for all bits)
 **/
class Solution0477 {
    fun totalHammingDistance(nums: IntArray): Int {
        var res = 0
        for (i in 0..31) {
            // count the number of 1bit
            var count = 0
            for (num in nums) {
                count += (num shr i) and 1
            }
            // total sum += (no. of 1bit * no. of 0bit)
            res += count * (nums.size - count)
        }
        return res
    }
}