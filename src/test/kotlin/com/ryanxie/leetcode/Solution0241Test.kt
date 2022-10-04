package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder
import strikt.assertions.isEqualTo

class Solution0241Test{
    private val solution = Solution0241()

    @Test
    fun test1(){
        val actual = solution.diffWaysToCompute("2-1-1")
        val expected = listOf(0, 2)
        expectThat(actual).containsExactlyInAnyOrder(expected)
    }
}