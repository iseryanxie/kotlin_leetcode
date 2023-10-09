package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0516Test{
    private val solution = Solution0516()

    @Test
    fun test1(){
        val actual = solution.longestPalindromeSubseq("bbbab")
        Assert.assertEquals(4, actual)
    }
}