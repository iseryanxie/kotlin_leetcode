package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0376Test{
    private val solution = Solution0376()

    @Test
    fun test1(){
        val actual = solution.wiggleMaxLength(intArrayOf(1,7,4,9,2,5))
        expectThat(actual).isEqualTo(6)
    }

}