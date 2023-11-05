package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0556Test{
    private val solution = Solution0556()

    @Test
    fun test1(){
        val actual = solution.nextGreaterElement(12)
        Assert.assertEquals(21, actual)
    }
}