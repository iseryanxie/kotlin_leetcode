package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0229 {
//    fun majorityElement(nums: IntArray): List<Int> {
//        val threshold = nums.size / 3
//        return nums.toList()
//            .groupingBy { it }
//            .eachCount()
//            .filter { it.value > threshold }
//            .map { it.key }
//    }
    fun majorityElement(nums: IntArray): List<Int> {
        // Boyer-Moore Voting Algorithm
        // since we need to find >= n/3, we need to keep track of two candidates and two counts
        var count1 = 0
        var count2 = 0
        var candidate1: Int? = null
        var candidate2: Int? = null
        for (num in nums) {
            if (candidate1 == num) {
                count1 ++
            } else if (candidate2 == num) {
                count2 ++
            } else if (count1 == 0) {
                candidate1 = num
                count1 = 1
            } else if (count2 == 0) {
                candidate2 = num
                count2 = 1
            } else {
                count1--
                count2--
            }
        }
        val threshold = nums.size / 3
        val res = mutableListOf<Int>()
        setOf(candidate1, candidate2).forEach { c ->
            if (nums.count { it == c } > threshold) {
                c?.let { res.add(it) }
            }
        }

        return res
    }
}