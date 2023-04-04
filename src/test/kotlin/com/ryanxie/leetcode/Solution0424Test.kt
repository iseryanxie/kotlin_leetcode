package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0424Test{
    private val solution = Solution0424()

    @Test
    fun test1(){
        val actual = solution.characterReplacement("ABAB",2)
        expectThat(actual).isEqualTo(4)
    }

    @Test
    fun test2(){
        val actual = solution.characterReplacement("AABABBA",1)
        expectThat(actual).isEqualTo(4)
    }
}