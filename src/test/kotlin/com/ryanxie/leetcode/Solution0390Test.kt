package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0390Test{
    private val solution = Solution0390()

    @Test
    fun test1(){
        val actual = solution.lastRemaining(9)
        expectThat(actual).isEqualTo(6)
    }

}