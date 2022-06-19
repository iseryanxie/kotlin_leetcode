package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0213Test {
    private val solution = Solution0213()

    @Test
    fun test1() {
        val actual = solution.rob(intArrayOf(2, 3, 2))
        expectThat(actual).isEqualTo(3)
    }

    @Test
    fun test2() {
        val actual = solution.rob(intArrayOf(1, 2, 3, 1))
        expectThat(actual).isEqualTo(4)
    }

}