package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0396Test{
    private val solution = Solution0396()

    @Test
    fun test1(){
        val actual = solution.maxRotateFunction(intArrayOf(4,3,2,6))
        expectThat(actual).isEqualTo(26)
    }
}