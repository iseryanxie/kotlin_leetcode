package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder
import strikt.assertions.isEqualTo

class Solution0368Test{
    private val solution = Solution0368()

    @Test
    fun test1(){
        val actual = solution.largestDivisibleSubset(intArrayOf(1,2,3))
        expectThat(actual).containsExactlyInAnyOrder(listOf(1,2))
    }

    @Test
    fun test2(){
        val actual = solution.largestDivisibleSubset(intArrayOf(1,2,4,8))
        expectThat(actual).containsExactlyInAnyOrder(listOf(1,2,4,8))
    }

    @Test
    fun test3(){
        val actual = solution.largestDivisibleSubset(intArrayOf(4, 8, 10, 240))
        expectThat(actual).containsExactlyInAnyOrder(listOf(4, 8, 240))
    }
}