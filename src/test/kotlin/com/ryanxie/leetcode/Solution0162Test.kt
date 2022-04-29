package com.ryanxie.leetcode

import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0162Test {
    private val solution = Solution0162()

    @Test
    fun test1() {
        val actual = solution.findPeakElement(intArrayOf(1, 2, 3, 1))
        expectThat(actual).isEqualTo(2)
    }

    @Test
    fun test2() {
        val actual = solution.findPeakElement(intArrayOf(1, 2, 1, 3, 5, 6, 4))
        expectThat(actual).isEqualTo(5)
    }

}