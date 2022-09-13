package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0657Test{
    private val solution = Solution0657()

    @Test
    fun test1(){
        val actual = solution.judgeCircle("UD")
        expectThat(actual).isEqualTo(true)
    }

}