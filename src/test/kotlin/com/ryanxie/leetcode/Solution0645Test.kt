package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder
import strikt.assertions.isEqualTo

class Solution0645Test{
    private val solution = Solution0645()

    @Test
    fun test1(){
        val actual = solution.findErrorNums(intArrayOf(1,2,2,4))
        expectThat(actual.toList()).containsExactlyInAnyOrder(listOf(2,3))
    }

    @Test
    fun test2(){
        val actual = solution.findErrorNums(intArrayOf(2,2))
        expectThat(actual.toList()).containsExactlyInAnyOrder(listOf(1,2))
    }

}