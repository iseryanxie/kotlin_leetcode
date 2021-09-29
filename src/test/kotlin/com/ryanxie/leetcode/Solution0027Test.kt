package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0027Test{
    private val solution = Solution0027()

    @Test
    fun test1(){
        val nums = intArrayOf(2,3,3,2)
        val target = 3
        val res = solution.removeElement(nums,target)
        val actual = nums.take(res).toIntArray()
        Assert.assertArrayEquals(intArrayOf(2, 2), actual)
    }

    @Test
    fun test2(){
        val nums = intArrayOf(3,2,2,3)
        val target = 3
        val res = solution.removeElement(nums,target)
        val actual = nums.take(res).toIntArray()
        Assert.assertArrayEquals(intArrayOf(2, 2), actual)
    }
}