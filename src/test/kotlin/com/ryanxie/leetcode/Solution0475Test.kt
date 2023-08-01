package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0475Test{
    private val solution = Solution0475()

    @Test
    fun test1(){
        val actual = solution.findRadius(intArrayOf(1,2,3), intArrayOf(2))
        Assert.assertEquals(1, actual)
    }

}