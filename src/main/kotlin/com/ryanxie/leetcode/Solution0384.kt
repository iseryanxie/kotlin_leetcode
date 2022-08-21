package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0384 (val nums: IntArray) {

    fun reset(): IntArray {
        return nums
    }

    fun shuffle(): IntArray {
        val result = nums.clone()
        for (i in nums.indices) {
            val j = (Math.random() * (nums.size - i)).toInt() + i
            val temp = result[i]
            result[i] = result[j]
            result[j] = temp
        }
        return result
    }
}