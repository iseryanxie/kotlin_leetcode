package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0166Test{
    private val solution = Solution0166()

    @Test
    fun test1(){
        val actual = solution.fractionToDecimal(4, 333)
        expectThat(actual).isEqualTo("0.(012)")
    }

    @Test
    fun test2(){
        val actual = solution.fractionToDecimal(-1, -2147483648)
        expectThat(actual).isEqualTo("0.0000000004656612873077392578125")
    }
}