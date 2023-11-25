package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0532Test{
    private val solution = Solution0532()

    @Test
    fun test1(){
        val actual = solution.findPairs(intArrayOf(3, 1, 4, 1, 5), 2)
        Assert.assertEquals(2, actual)
    }
}