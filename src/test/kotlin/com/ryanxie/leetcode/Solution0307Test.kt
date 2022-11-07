package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0307Test{


    @Test
    fun test1(){
        val solution = NumArray(intArrayOf(1,3,5))
        Assert.assertEquals(9, solution.sumRange(0,2))
    }

    @Test
    fun test2(){
        val solution = NumArray(intArrayOf(1,3,5))
        solution.update(1,2)
        Assert.assertEquals(8, solution.sumRange(0,2))
    }
}