package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0442Test{
    private val solution = Solution0442()

    @Test
    fun test1(){
        val actual = solution.findDuplicates(intArrayOf(4,3,2,7,8,2,3,1))
        Assert.assertEquals(listOf(2,3), actual)
    }

}