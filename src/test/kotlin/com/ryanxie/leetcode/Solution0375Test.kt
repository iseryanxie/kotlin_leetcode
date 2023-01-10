package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0375Test{
    private val solution = Solution0375()

    @Test
    fun test1(){
        val actual = solution.getMoneyAmount(10)
        expectThat(actual).isEqualTo(16)
    }
}