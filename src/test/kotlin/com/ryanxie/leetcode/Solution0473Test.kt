package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0473Test{
    private val solution = Solution0473()

    @Test
    fun test1(){
        val actual = solution.makesquare(intArrayOf(1,1,2,2,2))
        Assert.assertEquals(true, actual)
    }

    @Test
    fun test2(){
        val actual = solution.makesquare(intArrayOf(3,3,3,3,4))
        Assert.assertEquals(false, actual)
    }
}