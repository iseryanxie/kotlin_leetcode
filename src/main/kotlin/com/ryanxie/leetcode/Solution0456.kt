package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Use a stack to store the candidate number K and the smallest number before number K
 */
class Solution0456 {
    fun find132pattern(nums: IntArray): Boolean {
        val stack = mutableListOf<Pair<Int, Int>>()
        var currentMin = nums[0]
        for (i in 1 until nums.size) {
            while (stack.isNotEmpty() && nums[i] >= stack.last().first) {
                stack.removeLast()
            }
            if (stack.isNotEmpty() && nums[i] > stack.last().second) {
                // found number K which is nums[i]: stack.last().second is number I, stack.last().first is number J
                return true
            }
            stack.add(Pair(nums[i], currentMin))
            currentMin = minOf(currentMin, nums[i])
        }
        return false
    }
}