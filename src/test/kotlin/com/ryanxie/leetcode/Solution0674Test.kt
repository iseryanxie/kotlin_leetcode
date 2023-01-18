package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0674Test{
    private val solution = Solution0674()

    @Test
    fun test1(){
        val actual = solution.findLengthOfLCIS(intArrayOf(1,3,5,4,7))
        expectThat(actual).isEqualTo(3)
    }
}