package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0062Test{
    private val solution = Solution0062()

    @Test
    fun test1(){
        val actual = solution.uniquePaths(3, 7)
        Assert.assertEquals(28, actual)
    }

    @Test
    fun test2(){
        val actual = solution.uniquePaths(10, 10)
        Assert.assertEquals(48620, actual)
    }
}