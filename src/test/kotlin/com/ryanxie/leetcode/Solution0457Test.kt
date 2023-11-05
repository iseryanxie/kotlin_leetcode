package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0457Test{
    private val solution = Solution0457()

    @Test
    fun test1(){
        val actual = solution.circularArrayLoop(intArrayOf(2,-1,1,2,2))
        Assert.assertEquals(true, actual)
    }
}