package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0697Test{
    private val solution = Solution0697()

    @Test
    fun test1(){
        val actual = solution.findShortestSubArray(intArrayOf(1,2,2,3,1))
        expectThat(actual).isEqualTo(2)
    }

    @Test
    fun test2(){
        val actual = solution.findShortestSubArray(intArrayOf(1,2,2,3,1,4,2))
        expectThat(actual).isEqualTo(6)
    }

    @Test
    fun test3(){
        val actual = solution.findShortestSubArray(intArrayOf(10,9,9,9,10))
        expectThat(actual).isEqualTo(3)
    }
}