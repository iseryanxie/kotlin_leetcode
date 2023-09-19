package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0503 {
    // only need to find the element that appears next and is greater than the current element
    fun nextGreaterElements(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n) { -1 }
        // stack stores the index of the elements that have not found the next greater element
        val stack = mutableListOf<Int>()
        // iterate twice to simulate the circular array
        for (i in 0 until 2 * n) {
            // the index of the current element in the original array
            val num = nums[i % n]
            while (stack.isNotEmpty() && nums[stack.last()] < num) {
                // if the current element is greater than the element at the top of the stack,
                // then the current element is the next greater element of the element at the top of the stack
                // so pop the element at the top of the stack and update the result
                result[stack.removeLast()] = num
            }
            if (i < n) {
                // only add the index of the first n elements to the stack
                stack.add(i)
            }
        }
        return result


    }
}