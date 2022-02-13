package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Assert.assertArrayEquals
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder
import strikt.assertions.isEqualTo

class Solution0081Test {
    private val solution = Solution0081()

    @Test
    fun test1() {
        val input = intArrayOf(2, 5, 6, 0, 0, 1, 2)
        val target = 0
        val expected = true
        val actual = solution.search(input, target)
        expectThat(actual).isEqualTo(expected)
    }

    @Test
    fun test2() {
        val input = intArrayOf(2, 5, 6, 0, 0, 1, 2)
        val target = 3
        val expected = false
        val actual = solution.search(input, target)
        expectThat(actual).isEqualTo(expected)
    }
}