package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0443Test{
    private val solution = Solution0443()

    @Test
    fun test1(){
        val actual = solution.compress(charArrayOf('a','a','b','b','c','c','c'))
        Assert.assertEquals(6, actual)
    }
}