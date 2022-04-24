package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0151Test{
    private val solution = Solution0151()

    @Test
    fun test1(){
        val actual = solution.reverseWords("the sky is blue")
        expectThat(actual).isEqualTo("blue is sky the")
    }

    @Test
    fun test2(){
        val actual = solution.reverseWords("  hello  world  ")
        expectThat(actual).isEqualTo("world hello")
    }

}