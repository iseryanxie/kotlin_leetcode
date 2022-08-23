package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0395Test{
    private val solution = Solution0395()

    @Test
    fun test1(){
        val actual = solution.longestSubstring("aaabb", 3)
        expectThat(actual).isEqualTo(3)
    }

    @Test
    fun test2(){
        val actual = solution.longestSubstring("ababbc", 2)
        expectThat(actual).isEqualTo(5)
    }

}