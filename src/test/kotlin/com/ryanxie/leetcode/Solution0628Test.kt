package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0628Test {
    private val solution = Solution0628()

    @Test
    fun test1() {
        val actual = solution.maximumProduct(intArrayOf(1, 2, 3))
        val expected = 6
        expectThat(actual).isEqualTo(expected)
    }

    @Test
    fun test2() {
        val actual = solution.maximumProduct(intArrayOf(-1, -2, -3, 3))
        val expected = 18
        expectThat(actual).isEqualTo(expected)
    }

}