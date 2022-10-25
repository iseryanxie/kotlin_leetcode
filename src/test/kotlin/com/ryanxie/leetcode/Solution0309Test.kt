package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0309Test{
    private val solution = Solution0309()

    @Test
    fun test1(){
        val actual = solution.maxProfit(intArrayOf(1,2,3,0,2))
        expectThat(actual).isEqualTo(3)
    }
}