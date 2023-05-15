package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0456Test{
    private val solution = Solution0456()

    @Test
    fun test1(){
        val actual = solution.find132pattern(intArrayOf(1,2,3,4))
        Assert.assertEquals(false, actual)
    }

    @Test
    fun test2(){
        val actual = solution.find132pattern(intArrayOf(3,1,4,2))
        Assert.assertEquals(true, actual)
    }
}