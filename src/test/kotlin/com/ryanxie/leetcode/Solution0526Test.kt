package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0526Test{
    private val solution = Solution0526()

    @Test
    fun test1(){
        val actual = solution.countArrangement(2)
        Assert.assertEquals(2, actual)
    }
}