package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0274Test {
    private val solution = Solution0274()

    @Test
    fun test1() {
        val actual = solution.hIndex(intArrayOf(3, 0, 6, 1, 5))
        val expected = 3
        expectThat(actual).isEqualTo(expected)
    }

}