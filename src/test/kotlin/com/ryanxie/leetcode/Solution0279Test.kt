package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0279Test{
    private val solution = Solution0279()

    @Test
    fun test1(){
        val actual = solution.numSquares(12)
        expectThat(actual).isEqualTo(3)
    }
}