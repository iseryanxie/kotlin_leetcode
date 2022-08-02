package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0322Test{
    private val solution = Solution0322()

    @Test
    fun test1(){
        val actual = solution.coinChange(intArrayOf(1,2,5), 11)
        expectThat(actual).isEqualTo(3)
    }

    @Test
    fun test2(){
        val actual = solution.coinChange(intArrayOf(2), 3)
        expectThat(actual).isEqualTo(-1)
    }

    @Test
    fun test3(){
        val actual = solution.coinChange(intArrayOf(1), 0)
        expectThat(actual).isEqualTo(0)
    }
}