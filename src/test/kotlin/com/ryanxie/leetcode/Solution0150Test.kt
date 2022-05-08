package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0150Test{
    private val solution = Solution0150()

    @Test
    fun test1(){
        val actual = solution.evalRPN(arrayOf("2", "1", "+", "3", "*"))
        expectThat(actual).isEqualTo(9)
    }
}