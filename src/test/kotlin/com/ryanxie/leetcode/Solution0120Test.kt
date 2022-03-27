package com.ryanxie.leetcode

import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class Solution0120Test {
    private val solution = Solution0120()

    @Test
    fun minimumTotal() {
        val expected = solution.minimumTotal(listOf(
            listOf(2),
            listOf(3, 4),
            listOf(6, 5, 7),
            listOf(4, 1, 8, 3)
        ))
        val actual = 11
        expectThat(expected).isEqualTo(actual)
    }
}