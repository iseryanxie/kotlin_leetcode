package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0026Test{
    private val solution = Solution0026()

    @Test
    fun test1(){
        val nums = intArrayOf(2,7,11,15)
        val res = solution.removeDuplicates(nums)
        val actual = nums.take(res).toIntArray()
        Assert.assertArrayEquals(intArrayOf(2,7,11,15), actual)
    }

    @Test
    fun test2(){
        val nums = intArrayOf(2,2,11,11)
        val res = solution.removeDuplicates(nums)
        val actual = nums.take(res).toIntArray()
        Assert.assertArrayEquals(intArrayOf(2,11), actual)
    }
}