package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0154Test{
    private val solution = Solution0154()

    @Test
    fun test1(){
        val nums = intArrayOf(5,1,2,3,4)
        val expected = 1
        val actual = solution.findMin(nums)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test2(){
        val nums = intArrayOf(4,5,6,7,0,1,4)
        val expected = 0
        val actual = solution.findMin(nums)
        Assert.assertEquals(expected, actual)
    }

    // more test cases
    @Test
    fun test3(){
        val nums = intArrayOf(2,2,2,0,1)
        val expected = 0
        val actual = solution.findMin(nums)
        Assert.assertEquals(expected, actual)
    }
}