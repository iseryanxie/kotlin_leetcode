package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0316Test{
    private val solution = Solution0316()

    @Test
    fun test1(){
        val actual = solution.removeDuplicateLetters("bcabc")
        expectThat(actual).isEqualTo("abc")
    }

    @Test
    fun test2(){
        val actual = solution.removeDuplicateLetters("cbacdcbc")
        expectThat(actual).isEqualTo("acdb")
    }
}