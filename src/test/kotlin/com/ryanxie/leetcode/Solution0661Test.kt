package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0661Test{
    private val solution = Solution0661()

    @Test
    fun test1(){
        val actual = solution.imageSmoother(arrayOf(
                intArrayOf(1,1,1),
                intArrayOf(1,0,1),
                intArrayOf(1,1,1)
        ))
        val expected = arrayOf(
                intArrayOf(0,0,0),
                intArrayOf(0,0,0),
                intArrayOf(0,0,0)
        )
        assert(actual contentDeepEquals expected)
    }
}