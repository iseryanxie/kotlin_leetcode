package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0012Test{
    private val solution = Solution0012()

    @Test
    fun test1(){
        val actual = solution.intToRoman(3)
        Assert.assertEquals("III", actual)
    }
    @Test
    fun test2(){
        val actual = solution.intToRoman(1994)
        Assert.assertEquals("MCMXCIV", actual)
    }
    @Test
    fun test3(){
        val actual = solution.intToRoman(20)
        Assert.assertEquals("XX", actual)
    }
}