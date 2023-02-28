package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0398Test{


    @Test
    fun test1(){
        val solution = Solution0398(intArrayOf(1,2,3,3,3))
        val actual = solution.pick(3)
        Assert.assertTrue(actual in 2..4)
    }

}