package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0137 {
    fun singleNumber(nums: IntArray): Int {
        val bits = IntArray(32)
        for (num in nums) {
            for (i in 0..31) {
                bits[i] += (num shr i) and 1
            }
        }
        var result = 0
        for (i in 0..31) {
            result += (bits[i] % 3) shl i
        }
        return result
    }
}