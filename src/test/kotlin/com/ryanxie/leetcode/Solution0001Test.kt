package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0001Test{
    private val solution = Solution0001()

    @Test
    fun test1(){
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        val actual = solution.twoSum(nums,target)
        Assert.assertArrayEquals(intArrayOf(0, 1), actual)
    }
}