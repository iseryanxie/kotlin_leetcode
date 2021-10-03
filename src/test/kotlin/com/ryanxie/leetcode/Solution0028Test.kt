package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0028Test{
    private val solution = Solution0028()

    @Test
    fun test1(){
        Assert.assertEquals(2, solution.strStr("hello","ll"))
    }

    @Test
    fun test2(){
        Assert.assertEquals(-1, solution.strStr("aaaaa","bba"))
    }

    @Test
    fun test3(){
        Assert.assertEquals(-1, solution.strStr("aaa","aaaa"))
    }

}