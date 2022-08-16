package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0371Test{
    private val solution = Solution0371()

    @Test
    fun test1(){
        val actual = solution.getSum(1, 2)
        expectThat(actual).isEqualTo(3)
    }

}