package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0557Test{
    private val solution = Solution0557()

    @Test
    fun test1(){
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWords("Let's take LeetCode contest"))
    }
}