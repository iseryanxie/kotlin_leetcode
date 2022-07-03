package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0223Test{
    private val solution = Solution0223()

    @Test
    fun test1() {
        val actual = solution.computeArea(-3, 0, 3, 4, 0, -1, 9, 2)
        expectThat(actual).isEqualTo(45)
    }
}