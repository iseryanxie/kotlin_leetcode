package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution1143Test{
    private val solution = Solution1143()

    @Test
    fun test1(){
        val actual = solution.longestCommonSubsequence("abcde", "ace")
        Assert.assertEquals(3, actual)
    }
}