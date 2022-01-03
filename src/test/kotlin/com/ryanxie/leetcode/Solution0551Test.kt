package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0551Test{
    private val solution = Solution0551()

    @Test
    fun test1(){
        Assert.assertEquals(true, solution.checkRecord("PPALLP"))
    }

    @Test
    fun test2(){
        Assert.assertEquals(false, solution.checkRecord("PPALLL"))
    }

    @Test
    fun test3(){
        Assert.assertEquals(false, solution.checkRecord("PAAPPP"))
    }
}