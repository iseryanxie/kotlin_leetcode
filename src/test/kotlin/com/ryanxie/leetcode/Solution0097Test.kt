package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0097Test {
    private val solution = Solution0097()

    @Test
    fun test1() {
        Assert.assertEquals(true, solution.isInterleave("aabcc", "dbbca", "aadbbcbcac"))
    }

    @Test
    fun test2() {
        Assert.assertEquals(true, solution.isInterleave("aabc", "abad", "aabcabad"))
    }
}