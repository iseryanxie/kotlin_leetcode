package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0421Test{
    private val solution = Solution0421()

    @Test
    fun test1(){
        val actual = solution.findMaximumXOR(intArrayOf(3,10,5,25,2,8))
        Assert.assertEquals(28, actual)
    }
}