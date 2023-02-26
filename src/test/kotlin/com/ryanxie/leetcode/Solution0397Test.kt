package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0397Test {
    private val solution = Solution0397()

    @Test
    fun test1() {
        val actual = solution.integerReplacement(8)
        expectThat(actual).isEqualTo(3)
    }

    @Test
    fun test2() {
        val actual = solution.integerReplacement(7)
        expectThat(actual).isEqualTo(4)
    }

    @Test
    fun test3() {
        val actual = solution.integerReplacement(3)
        expectThat(actual).isEqualTo(2)
    }
}