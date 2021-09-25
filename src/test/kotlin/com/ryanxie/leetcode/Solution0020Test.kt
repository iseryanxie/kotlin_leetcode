package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0020Test{
    private val solution = Solution0020()

    @Test
    fun test1(){
        val actual = solution.isValid("{{[()]}}")
        Assert.assertEquals(true, actual)
    }

    @Test
    fun test2(){
        val actual = solution.isValid("{{[)]}}")
        Assert.assertEquals(false, actual)
    }
}