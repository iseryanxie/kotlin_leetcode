package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0221Test{
    private val solution = Solution0221()

    @Test
    fun test1(){
        val actual = solution.maximalSquare(arrayOf(
            charArrayOf('1','0','1','0','0'),
            charArrayOf('1','0','1','1','1'),
            charArrayOf('1','1','1','1','1'),
            charArrayOf('1','0','0','1','0')
        ))
        expectThat(actual).isEqualTo(4)
    }
}