package com.ryanxie.leetcode

class Solution0001 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // not used
        // val nNums = nums.size

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