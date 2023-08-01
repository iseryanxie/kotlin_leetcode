package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0474Test{
    private val solution = Solution0474()

    @Test
    fun test1(){
        val actual = solution.findMaxForm(arrayOf("10", "0001", "111001", "1", "0"), 5, 3)
        Assert.assertEquals(4, actual)
    }
}