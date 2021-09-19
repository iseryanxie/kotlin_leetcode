package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0007Test{
    private val solution = Solution0007()

    @Test
    fun test1(){
        val actual = solution.reverse(123)
        Assert.assertEquals(321, actual)
    }

    @Test
    fun test2(){
        val actual = solution.reverse(1534236469)
        Assert.assertEquals(0, actual)
    }
}