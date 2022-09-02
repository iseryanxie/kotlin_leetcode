package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0217Test{
    private val solution = Solution0217()

    @Test
    fun test1(){
        val actual = solution.containsDuplicate(intArrayOf(1,2,3,1))
        expectThat(actual).isEqualTo(true)
    }

    @Test
    fun test2(){
        val actual = solution.containsDuplicate(intArrayOf(1,2,3,4))
        expectThat(actual).isEqualTo(false)
    }
}