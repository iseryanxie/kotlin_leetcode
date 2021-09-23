package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0013Test{
    private val solution = Solution0013()

    @Test
    fun test1(){
        val actual = solution.romanToInt("III")
        Assert.assertEquals(3, actual)
    }
    @Test
    fun test2(){
        val actual = solution.romanToInt("MCMXCIV")
        Assert.assertEquals(1994, actual)
    }
}