package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0377Test{
    private val solution = Solution0377()

    @Test
    fun test1(){
        val actual = solution.combinationSum4(intArrayOf(1,2,3), 4)
        expectThat(actual).isEqualTo(7)
    }
}