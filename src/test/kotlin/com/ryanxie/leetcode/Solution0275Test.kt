package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0275Test{
    private val solution = Solution0275()

    @Test
    fun test1(){
        val actual = solution.hIndex(intArrayOf(0,1,3,5,6))
        val expected = 3
        expectThat(actual).isEqualTo(expected)
    }

    @Test
    fun test2(){
        val actual = solution.hIndex(intArrayOf(1,2,100))
        val expected = 2
        expectThat(actual).isEqualTo(expected)
    }

}