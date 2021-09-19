package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0014Test{
    private val solution = Solution0014()

    @Test
    fun test1(){
        val strs = arrayOf("flower","flow","flight")
        val actual = solution.longestCommonPrefix(strs)
        Assert.assertEquals("fl", actual)
    }
}