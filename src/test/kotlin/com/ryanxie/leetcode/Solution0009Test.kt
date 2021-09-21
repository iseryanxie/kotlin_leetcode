package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0009Test{
    private val solution = Solution0009()

    @Test
    fun test1(){
        val nums = 121
        val actual = solution.isPalindrome(nums)
        Assert.assertEquals(true, actual)
    }
}