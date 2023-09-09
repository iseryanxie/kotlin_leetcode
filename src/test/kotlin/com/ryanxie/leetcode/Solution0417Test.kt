package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0417Test{
    private val solution = Solution0417()

    @Test
    fun test1(){
        val actual = solution.pacificAtlantic(arrayOf(intArrayOf(1,2,2,3,5), intArrayOf(3,2,3,4,4), intArrayOf(2,4,5,3,1), intArrayOf(6,7,1,4,5), intArrayOf(5,1,1,2,4)))
        Assert.assertEquals(listOf(listOf(0,4), listOf(1,3), listOf(1,4), listOf(2,2), listOf(3,0), listOf(3,1), listOf(4,0)), actual)
    }

}