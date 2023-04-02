package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0416Test{
    private val solution = Solution0416()

    @Test
    fun test1(){
        val actual = solution.canPartition(intArrayOf(1,5,11,5))
        expectThat(actual).isEqualTo(true)
    }
}