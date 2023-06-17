package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0468Test{
    private val solution = Solution0468()

    @Test
    fun test1(){
        val actual = solution.validIPAddress("172.16.254.1")
        Assert.assertEquals("IPv4", actual)

    }

    @Test
    fun test2(){
        val actual = solution.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334")
        Assert.assertEquals("IPv6", actual)

    }

    @Test
    fun test3(){
        val actual = solution.validIPAddress("256.256.256.256")
        Assert.assertEquals("Neither", actual)

    }

}