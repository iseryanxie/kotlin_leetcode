package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0393Test{
    private val solution = Solution0393()

    @Test
    fun test1(){
        val actual = solution.validUtf8(intArrayOf(197, 130, 1))
        expectThat(actual).isEqualTo(true)
    }
}