package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0365Test{
    private val solution = Solution0365()

    @Test
    fun test1(){
        val actual = solution.canMeasureWater(3,5,4)
        expectThat(actual).isEqualTo(true)
    }
}