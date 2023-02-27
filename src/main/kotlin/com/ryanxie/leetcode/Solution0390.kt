package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0390 {
    fun lastRemaining(n: Int): Int {
        var head = 1 // the head of the remaining list
        var step = 1 // step size in original list
        var remaining = n // remaining number of elements
        var isLeftToRight = true // from left to right
        while (remaining > 1){
            if (isLeftToRight || (!isLeftToRight && remaining % 2 == 1)){
                // if left to right, head always increment by step size
                // if right to left, head only increment by step size if remaining is odd, otherwise head stays the same
                head += step
            }
            step *= 2 // each enumeration, step size double
            remaining /= 2 // each enumeration, remaining number of elements half
            isLeftToRight = !isLeftToRight
        }
        return head
    }
}