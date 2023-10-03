package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0164Test{
    private val solution = Solution0164()

    @Test
    fun test1(){
        val actual = solution.maximumGap(intArrayOf(3,6,9,1))
        Assert.assertEquals(3, actual)
    }
}