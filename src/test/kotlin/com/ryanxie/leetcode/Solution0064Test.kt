package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0064Test{
    private val solution = Solution0064()

    @Test
    fun test1(){
        val actual = solution.minPathSum(arrayOf(
            intArrayOf(1,3,1),
            intArrayOf(1,5,1),
            intArrayOf(4,2,1)
        ))
        Assert.assertEquals(7, actual)
    }
}