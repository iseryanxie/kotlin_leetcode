package com.ryanxie.leetcode

import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0300Test {
    private val solution = Solution0300()

    @Test
    fun test1() {
        val actual = solution.lengthOfLIS(intArrayOf(10, 9, 2, 5, 3, 7, 101, 18))
        expectThat(actual).isEqualTo(4)
    }

    @Test
    fun test2() {
        val actual = solution.lengthOfLIS(intArrayOf(2, 5, 3, 7))
        expectThat(actual).isEqualTo(4)
    }
}