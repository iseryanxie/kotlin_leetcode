package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0032Test{
    private val solution = Solution0032()

    @Test
    fun test1() {
        val actual = solution.longestValidParentheses("(()")
        val expected = 2
        expectThat(actual).isEqualTo(expected)
    }

    @Test
    fun test2() {
        val actual = solution.longestValidParentheses(")()())")
        val expected = 4
        expectThat(actual).isEqualTo(expected)
    }
}