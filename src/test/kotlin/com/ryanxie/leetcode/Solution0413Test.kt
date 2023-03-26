package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0413Test{
    private val solution = Solution0413()

    @Test
    fun test1(){
        val actual = solution.numberOfArithmeticSlices(intArrayOf(1,2,3,4))
        Assert.assertEquals(3, actual)
    }

    @Test
    fun test2(){
        val actual = solution.numberOfArithmeticSlices(intArrayOf(1,3,5,7,9))
        Assert.assertEquals(6, actual)
    }
}