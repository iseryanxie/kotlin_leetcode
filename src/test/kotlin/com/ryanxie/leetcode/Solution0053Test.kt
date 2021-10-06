package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0053Test{
    private val solution = Solution0053()

    @Test
    fun test1(){
        val nums = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
        val expected = 6
        val actual = solution.maxSubArray(nums)
        Assert.assertEquals(expected, actual)
    }
}