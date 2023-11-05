package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0522Test{
    private val solution = Solution0522()

    @Test
    fun test1(){
        val actual = solution.findLUSlength(arrayOf("aba", "cdc", "eae"))
        Assert.assertEquals(3, actual)
    }
}