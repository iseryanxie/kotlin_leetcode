package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0724Test{
    private val solution = Solution0724()

    @Test
    fun test1(){
        val actual = solution.pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6))
        Assert.assertEquals(3, actual)
    }

}