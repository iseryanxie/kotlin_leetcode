package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0260 {
    fun singleNumber(nums: IntArray): IntArray {
        val xor = nums.reduce { acc, i -> acc.xor(i) } // any number that appeared 2 times will be 0
        val mask = xor.and(-xor) // get the rightmost 1 bit
        var a = 0
        var b = 0
        for (num in nums) {
            // split the array into 2 groups based on whether the rightmost bit is 0 or 1, each group has 1 unique number
            if (num.and(mask) == 0) {
                // take xor of all numbers in the group, the result is the unique number in this group
                a = a.xor(num)
            } else {
                b = b.xor(num)
            }
        }
        return intArrayOf(a, b)
    }
}