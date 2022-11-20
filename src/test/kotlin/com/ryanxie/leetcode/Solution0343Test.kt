package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0343Test{
    private val solution = Solution0343()

    @Test
    fun test1(){
        val actual = solution.integerBreak(2)
        expectThat(actual).isEqualTo(1)
    }

    @Test
    fun test2(){
        val actual = solution.integerBreak(10)
        expectThat(actual).isEqualTo(36)
    }
}