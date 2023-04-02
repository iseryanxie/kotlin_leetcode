package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0423Test{
    private val solution = Solution0423()

    @Test
    fun test1(){
        val actual = solution.originalDigits("owoztneoer")
        expectThat(actual).isEqualTo("012")
    }
}