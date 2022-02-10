package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Assert.assertArrayEquals
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder

class Solution0077Test {
    private val solution = Solution0077()

    @Test
    fun test1() {
        val expected = listOf(
            listOf(1, 2),
            listOf(1, 4),
            listOf(1, 3),
            listOf(2, 3),
            listOf(3, 4),
            listOf(2, 4)
        )
        val actual = solution.combine(4, 2)
        expectThat(actual).containsExactlyInAnyOrder(expected)
    }
}