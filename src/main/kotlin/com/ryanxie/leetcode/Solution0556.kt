package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0556 {
    fun nextGreaterElement(n: Int): Int {
        val digits = n.toString().toCharArray()
        // find the first digit that is smaller than the previous one
        var index = digits.size - 1
        while (index > 0) {
            if (digits[index] > digits[index - 1]) {
                break
            }
            --index
        }
        // current n is the largest number
        if (index == 0) {
            return -1
        }
        val pivot = digits[index - 1]
        var swapIndex = digits.size - 1
        while (swapIndex >= index) {
            // find the smallest number that is larger than pivot
            if (digits[swapIndex] > pivot) {
                break
            }
            --swapIndex
        }
        digits[index - 1] = digits[swapIndex].also { digits[swapIndex] = digits[index - 1] }
        // sort the rest of the digits
        digits.sort(index, digits.size)
        val result = digits.joinToString("").toLong()
        return if (result > Int.MAX_VALUE) -1 else result.toInt()

    }
}