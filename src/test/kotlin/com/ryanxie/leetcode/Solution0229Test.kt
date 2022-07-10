package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0229Test{
    private val solution = Solution0229()

    @Test
    fun test1() {
        val input = intArrayOf(3, 2, 3)
        val expect = listOf(3)
        expectThat(solution.majorityElement(input)).isEqualTo(expect)
    }

    @Test
    fun test2() {
        val input = intArrayOf(2,1,1,3,1,4,5,6)
        val expect = listOf(1)
        expectThat(solution.majorityElement(input)).isEqualTo(expect)
    }
}