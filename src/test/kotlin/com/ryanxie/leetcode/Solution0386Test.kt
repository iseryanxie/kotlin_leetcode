package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0386Test {
    private val solution = Solution0386()

    @Test
    fun test1() {
        val actual = solution.lexicalOrder(13)
        val expected = listOf(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9)
        expectThat(actual).isEqualTo(expected)
    }

}