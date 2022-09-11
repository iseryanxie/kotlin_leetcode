package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0628 {
    fun maximumProduct(nums: IntArray): Int {
        // find the 3 largest numbers
        var max1 = Int.MIN_VALUE
        var max2 = Int.MIN_VALUE
        var max3 = Int.MIN_VALUE
        // find the 2 smallest numbers (potentially most negative)
        var min1 = Int.MAX_VALUE
        var min2 = Int.MAX_VALUE
        for (num in nums) {
            if (num > max1) {
                max3 = max2
                max2 = max1
                max1 = num
            } else if (num > max2) {
                max3 = max2
                max2 = num
            } else if (num > max3) {
                max3 = num
            }
            if (num < min1) {
                min2 = min1
                min1 = num
            } else if (num < min2) {
                min2 = num
            }
        }
        // max of 3 largest numbers or 2 most negative numbers and 1 largest number
        return maxOf(max1 * max2 * max3, max1 * min1 * min2)
    }
}