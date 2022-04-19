package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * for each bit, add up the value and then take the mod of 3
 * add back the values
 * This approach takes care of both positive and negative numbers, because signs are stored in bits too
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