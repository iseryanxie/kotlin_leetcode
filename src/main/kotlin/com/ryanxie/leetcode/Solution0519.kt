package com.ryanxie.leetcode

import kotlin.random.Random

/**
 * Write your thoughts here
 * Prepopulate a stack that is shuffled (randomized once) and pop from it each time needed a flip
 */
class Solution0519(val m: Int, val n: Int) {


    val stackOfSortedIndices = getStackOfSortedIndices(m, n)

    fun getStackOfSortedIndices(m: Int, n: Int): MutableList<Int> {
        val stack = mutableListOf<Int>()
        var index = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                stack.add(index)
                index++
            }
        }
        stack.shuffle()
        return stack
    }

    fun flip(): IntArray {
        // remove the first element
        val index = stackOfSortedIndices.removeAt(0)
        return intArrayOf(index / n, index % n)
    }

    fun reset() {
        stackOfSortedIndices.clear()
        stackOfSortedIndices.addAll(getStackOfSortedIndices(m, n))

    }
}