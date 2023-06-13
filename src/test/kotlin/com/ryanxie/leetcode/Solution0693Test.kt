package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0693Test{
    private val solution = Solution0693()

    @Test
    fun test1(){
        val actual = solution.hasAlternatingBits(5)
        Assert.assertEquals(true, actual)
    }
}