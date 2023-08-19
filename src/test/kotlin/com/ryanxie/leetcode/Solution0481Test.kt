package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0481Test{
    private val solution = Solution0481()

    @Test
    fun test1(){
        val actual = solution.magicalString(6)
        Assert.assertEquals(3, actual)
    }

}