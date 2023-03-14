package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0402Test{
    private val solution = Solution0402()

    @Test
    fun test1(){
        val actual = solution.removeKdigits("1432219", 3)
        val expected = "1219"
        expectThat(actual).isEqualTo(expected)
    }
}