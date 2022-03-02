package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder
import strikt.assertions.isEqualTo

class Solution0096Test {
    private val solution = Solution0096()

    @Test
    fun test1() {
        val actual = solution.numTrees(3)
        val expected = 5
        expectThat(actual).isEqualTo(expected)
    }
}