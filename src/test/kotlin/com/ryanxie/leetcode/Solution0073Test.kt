package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0073Test {
    private val solution = Solution0073()

    @Test
    fun test1() {
        val original = arrayOf(
            intArrayOf(1, 3, 1),
            intArrayOf(1, 0, 1),
            intArrayOf(4, 2, 1)
        )

        solution.setZeroes(original)
        Assert.assertArrayEquals(arrayOf(intArrayOf(1, 0, 1), intArrayOf(0, 0, 0), intArrayOf(4, 0, 1)), original)
    }
}