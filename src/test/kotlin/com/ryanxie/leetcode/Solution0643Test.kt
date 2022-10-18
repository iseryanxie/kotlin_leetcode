package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat

class Solution0643Test{
    private val solution = Solution0643()

    @Test
    fun test1(){
        val actual = solution.findMaxAverage(intArrayOf(1,12,-5,-6,50,3), 4)
        Assert.assertEquals(12.75, actual, 0.0001)
    }
}