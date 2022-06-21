package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0216Test{
    private val solution = Solution0216()

    @Test
    fun test1(){
        val actual = solution.combinationSum3(3, 7)
        val expected = listOf(listOf(1,2,4))
        expectThat(actual).isEqualTo(expected)
    }

}