package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0063Test{
    private val solution = Solution0063()

    @Test
    fun test1(){
        val actual = solution.uniquePathsWithObstacles(arrayOf(
            intArrayOf(0,0,0),
            intArrayOf(0,1,0),
            intArrayOf(0,0,0)
        ))
        Assert.assertEquals(2, actual)
    }

    @Test
    fun test2(){
        val actual = solution.uniquePathsWithObstacles(arrayOf(
            intArrayOf(0,1),
            intArrayOf(0,0)
        ))
        Assert.assertEquals(1, actual)
    }
}