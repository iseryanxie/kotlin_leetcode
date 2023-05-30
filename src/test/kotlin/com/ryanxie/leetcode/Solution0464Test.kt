package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0464Test{
    private val solution = Solution0464()

    @Test
    fun test1(){
        val actual = solution.canIWin(10, 11)
        Assert.assertEquals(false, actual)
    }
}