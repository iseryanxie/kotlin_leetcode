package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder
import strikt.assertions.contentEquals

class Solution0260Test{
    private val solution = Solution0260()

    @Test
    fun test1(){
        val actual = solution.singleNumber(intArrayOf(1,2,1,3,2,5))
        val expected = intArrayOf(3,5)
        expectThat(actual.toList()).containsExactlyInAnyOrder(expected.toList())
    }

}