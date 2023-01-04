package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0372Test {
    private val solution = Solution0372()

    @Test
    fun test1() {
        val actual = solution.superPow(2, intArrayOf(3))
        expectThat(actual).isEqualTo(8)
    }

    @Test
    fun test2() {
        val actual = solution.superPow(2, intArrayOf(1, 0))
        expectThat(actual).isEqualTo(1024)
    }


    @Test
    fun test3() {
        val actual = solution.superPow(1, intArrayOf(4, 3, 3, 8, 5, 2))
        expectThat(actual).isEqualTo(1)
    }
}