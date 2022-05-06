package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0179Test {
    private val solution = Solution0179()

    @Test
    fun test1() {
        val actual = solution.largestNumber(intArrayOf(3, 30, 34, 5, 9))
        expectThat(actual).isEqualTo("9534330")
    }

    @Test
    fun test2() {
        val actual = solution.largestNumber(intArrayOf(0, 0, 0))
        expectThat(actual).isEqualTo("0")
    }

}