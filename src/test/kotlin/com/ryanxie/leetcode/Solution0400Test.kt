package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0400Test {
    private val solution = Solution0400()

    @Test
    fun test1() {
        val actual = solution.findNthDigit(3)
        expectThat(actual).isEqualTo(3)
    }

    @Test
    fun test2() {
        val actual = solution.findNthDigit(11)
        expectThat(actual).isEqualTo(0)
    }

    @Test
    fun test3() {
        val actual = solution.findNthDigit(1000000000)
        expectThat(actual).isEqualTo(1)
    }
}