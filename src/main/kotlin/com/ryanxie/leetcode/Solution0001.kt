package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0001 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sumToIdx = HashMap<Int, Int>()

        for ((idx, num) in nums.withIndex()) {
            val expectedSum = target - num

            sumToIdx[expectedSum]?.let {
                if (it != idx)
                    return intArrayOf(it, idx)
            }

            sumToIdx[num] = idx
        }

        return intArrayOf()
    }
}