package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0264Test{
    private val solution = Solution0264()

    @Test
    fun test1(){
        val actual = solution.nthUglyNumber(10)
        expectThat(actual).isEqualTo(12)
    }

}