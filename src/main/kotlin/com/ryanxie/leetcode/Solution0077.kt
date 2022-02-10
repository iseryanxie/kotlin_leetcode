package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * backtrack with recursion
 */
class Solution0077 {
    fun combine(n: Int, k: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val nums = IntArray(n) { it + 1 }
        backtrack(nums, k, 0, mutableListOf(), result)
        return result
    }

    fun backtrack(nums: IntArray, k: Int, start: Int, select: MutableList<Int>, result: MutableList<List<Int>>) {
        if (select.size==k) {
            result.add(select.toList())
            return
        }
        for (i in start until nums.size){
            select.add(nums[i])
            backtrack(nums, k, i+1, select, result)
            select.remove(nums[i])
        }
    }
}