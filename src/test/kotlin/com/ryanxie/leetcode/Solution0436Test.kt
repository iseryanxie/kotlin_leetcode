package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0436Test{
    private val solution = Solution0436()

    @Test
    fun test1(){
        val actual = solution.findRightInterval(arrayOf(intArrayOf(1,2)))
        Assert.assertArrayEquals(intArrayOf(-1), actual)
    }

    @Test
    fun test2(){
        val actual = solution.findRightInterval(arrayOf(intArrayOf(3,4), intArrayOf(2,3), intArrayOf(1,2)))
        Assert.assertArrayEquals(intArrayOf(-1,0,1), actual)
    }
}