package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0334Test {
    private val solution = Solution0334()

    @Test
    fun test1() {
        val actual = solution.increasingTriplet(intArrayOf(1, 2, 3, 4, 5))
        expectThat(actual).isEqualTo(true)
    }

    @Test
    fun test2() {
        val actual = solution.increasingTriplet(intArrayOf(5, 4, 3, 2, 1))
        expectThat(actual).isEqualTo(false)
    }

    @Test
    fun test3() {
        val actual = solution.increasingTriplet(intArrayOf(1, 2, 2, 2, 2))
        expectThat(actual).isEqualTo(false)
    }

    @Test
    fun test4() {
        val actual = solution.increasingTriplet(intArrayOf(2, 1, 5, 0, 4, 6))
        expectThat(actual).isEqualTo(true)
    }
}