package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0035Test{
    private val solution = Solution0035()

    @Test
    fun test1(){
        val nums = intArrayOf(1,3,5,6)
        val target = 5
        val actual = solution.searchInsert(nums,target)
        Assert.assertEquals(2, actual)
    }

    @Test
    fun test2(){
        val nums = intArrayOf(1,3,5,6)
        val target = 2
        val actual = solution.searchInsert(nums,target)
        Assert.assertEquals(1, actual)
    }

    @Test
    fun test3(){
        val nums = intArrayOf(1,3,5,6)
        val target = 7
        val actual = solution.searchInsert(nums,target)
        Assert.assertEquals(4, actual)
    }

    @Test
    fun test4(){
        val nums = intArrayOf(1,3,5,6)
        val target = 0
        val actual = solution.searchInsert(nums,target)
        Assert.assertEquals(0, actual)
    }
}