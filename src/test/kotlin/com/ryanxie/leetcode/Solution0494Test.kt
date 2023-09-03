package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0494Test{
    private val solution = Solution0494()

    @Test
    fun test1(){
        val actual = solution.findTargetSumWays(intArrayOf(1,1,1,1,1), 3)
        Assert.assertEquals(5, actual)
    }

}