package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0074Test{
    private val solution = Solution0074()

    @Test
    fun test1(){
        val actual = solution.searchMatrix(arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 50)
        ), 3)
        Assert.assertEquals(true, actual)
    }
}