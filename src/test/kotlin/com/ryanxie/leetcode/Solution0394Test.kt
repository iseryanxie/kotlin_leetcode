package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0394Test{
    private val solution = Solution0394()

    @Test
    fun test1(){
        val actual = solution.decodeString("3[a]2[bc]")
        expectThat(actual).isEqualTo("aaabcbc")
    }

    @Test
    fun test2(){
        val actual = solution.decodeString("3[a2[c]]")
        expectThat(actual).isEqualTo("accaccacc")
    }

    @Test
    fun test3(){
        val actual = solution.decodeString("100[leetcode]")
        expectThat(actual).isEqualTo("leetcode".repeat(100))
    }

}