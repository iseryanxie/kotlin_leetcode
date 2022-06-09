package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0209Test{
    private val solution = Solution0209()

    @Test
    fun test1(){
        val actual = solution.minSubArrayLen(7, intArrayOf(2,3,1,2,4,3))
        expectThat(actual).isEqualTo(2)
    }

}