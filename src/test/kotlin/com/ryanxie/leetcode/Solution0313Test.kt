package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0313Test{
    private val solution = Solution0313()

    @Test
    fun test1(){
        val actual = solution.nthSuperUglyNumber(12, intArrayOf(2,7,13,19))
        expectThat(actual).isEqualTo(32)
    }

    @Test
    fun test2(){
        val actual = solution.nthSuperUglyNumber(5911, intArrayOf(2,3,5,7))
        expectThat(actual).isEqualTo(2144153025L)
    }
}