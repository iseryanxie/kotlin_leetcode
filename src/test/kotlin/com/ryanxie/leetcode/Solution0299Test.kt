package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0299Test{
    private val solution = Solution0299()

    @Test
    fun test1(){
        val actual = solution.getHint("1807", "7810")
        val expected = "1A3B"
        expectThat(actual).isEqualTo(expected)
    }
}