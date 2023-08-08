package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0452Test{
    private val solution = Solution0452()

    @Test
    fun test1(){
        val actual = solution.findMinArrowShots(arrayOf(intArrayOf(10,16), intArrayOf(2,8), intArrayOf(1,6), intArrayOf(7,12)))
        Assert.assertEquals(2, actual)
    }
}