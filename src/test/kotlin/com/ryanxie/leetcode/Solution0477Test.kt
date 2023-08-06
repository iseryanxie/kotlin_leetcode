package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0477Test{
    private val solution = Solution0477()

    @Test
    fun test1(){
        val actual = solution.totalHammingDistance(intArrayOf(4, 14, 2))
        Assert.assertEquals(6, actual)
    }
}