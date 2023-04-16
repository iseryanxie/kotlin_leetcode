package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0435Test{
    private val solution = Solution0435()

    @Test
    fun test1(){
        val actual = solution.eraseOverlapIntervals(arrayOf(intArrayOf(1,2), intArrayOf(2,3), intArrayOf(3,4), intArrayOf(1,3)))
        Assert.assertEquals(1, actual)
    }

}