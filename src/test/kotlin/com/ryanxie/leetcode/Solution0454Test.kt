package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0454Test {
    private val solution = Solution0454()

    @Test
    fun test1() {
        val actual = solution.fourSumCount(intArrayOf(1, 2), intArrayOf(-2, -1), intArrayOf(-1, 2), intArrayOf(0, 2))
        expectThat(actual).isEqualTo(2)
    }

}