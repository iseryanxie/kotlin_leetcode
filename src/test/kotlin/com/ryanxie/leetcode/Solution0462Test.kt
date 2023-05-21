package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0462Test{
    private val solution = Solution0462()

    @Test
    fun test1(){
        val actual = solution.minMoves2(intArrayOf(1,2,3))
        Assert.assertEquals(2, actual)
    }

    @Test
    fun test2(){
        val actual = solution.minMoves2(intArrayOf(1,10,2,9))
        Assert.assertEquals(16, actual)
    }
}