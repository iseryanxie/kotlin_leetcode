package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test


class Solution0696Test {
    private val solution = Solution0696()

    @Test
    fun test1(){
        val actual = solution.countBinarySubstrings("00110011")
        Assert.assertEquals(6, actual)
    }
}