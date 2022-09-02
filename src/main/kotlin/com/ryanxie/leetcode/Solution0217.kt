package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0217 {
    fun containsDuplicate(nums: IntArray): Boolean {
        val seen = mutableSetOf<Int>()
        nums.forEach { num ->
            if (seen.contains(num)) {
                return true
            } else {
                seen.add(num)
            }
        }
        return false
    }
}