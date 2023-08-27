package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0875Test{
    private val solution = Solution0875()

    @Test
    fun test1(){
        val actual = solution.minEatingSpeed(intArrayOf(3,6,7,11), 8)
        Assert.assertEquals(4, actual)
    }

}