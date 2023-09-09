package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0491Test {
    private val solution = Solution0491()

    @Test
    fun test1() {
        val actual = solution.findSubsequences(intArrayOf(4, 6, 7, 7))
        val expected = listOf(listOf(4, 6), listOf(4, 6, 7), listOf(4, 6, 7, 7), listOf(4, 7), listOf(4, 7, 7), listOf(6, 7), listOf(6, 7, 7), listOf(7, 7))
        Assert.assertEquals(expected, actual)
    }
}