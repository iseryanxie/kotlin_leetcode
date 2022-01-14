package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class Solution0059Test {
    private val underTest = Solution0059()

    @Test
    fun generateMatrix() {
        val actual = underTest.generateMatrix(3)
        assertArrayEquals(arrayOf(intArrayOf(1, 2, 3), intArrayOf(8, 9, 4), intArrayOf(7, 6, 5)), actual)
    }
}