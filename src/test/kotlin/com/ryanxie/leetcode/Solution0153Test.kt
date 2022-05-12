package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0153Test {
    private val solution = Solution0153()

    @Test
    fun test1() {
        val actual = solution.findMin(intArrayOf(3, 4, 5, 1, 2))
        expectThat(actual).isEqualTo(1)
    }

}