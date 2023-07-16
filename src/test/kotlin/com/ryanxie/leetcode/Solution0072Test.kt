package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0072Test{
    private val solution = Solution0072()

    @Test
    fun test1(){
        val actual = solution.minDistance("horse", "ros")
        Assert.assertEquals(3, actual)
    }
}