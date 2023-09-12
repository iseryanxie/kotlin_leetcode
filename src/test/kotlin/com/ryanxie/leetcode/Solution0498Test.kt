package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0498Test{
    private val solution = Solution0498()

    @Test
    fun test1(){
        val actual = solution.findDiagonalOrder(arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9)))
        Assert.assertArrayEquals(intArrayOf(1,2,4,7,5,3,6,8,9), actual)
    }
}