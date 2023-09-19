package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0503Test{
    private val solution = Solution0503()

    @Test
    fun test1(){
        val actual = solution.nextGreaterElements(intArrayOf(1,2,1))
        Assert.assertArrayEquals(intArrayOf(2,-1,2), actual)
    }
}