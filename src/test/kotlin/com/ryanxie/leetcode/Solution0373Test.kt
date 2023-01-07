package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0373Test {
    private val solution = Solution0373()

    @Test
    fun test1() {
        val actual = solution.kSmallestPairs(intArrayOf(1, 7, 11), intArrayOf(2, 4, 6), 3)
        val expected = listOf(
            listOf(1, 2),
            listOf(1, 4),
            listOf(1, 6)
        )
        expectThat(actual).isEqualTo(expected)
    }

    @Test
    fun test2() {
        val actual = solution.kSmallestPairs(
            intArrayOf(-999, -999, -996, -993),
            intArrayOf(-1000, -997, -997, -984),
            5
        )
        val expected = listOf(
            listOf(-999, -1000), listOf(-999, -1000), listOf(-996, -1000), listOf(-999, -997), listOf(-999, -997)
        )
        expectThat(actual).isEqualTo(expected)
    }
}