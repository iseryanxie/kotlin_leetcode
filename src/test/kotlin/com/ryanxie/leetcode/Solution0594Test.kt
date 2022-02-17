package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0594Test {
    private val solution = Solution0594()

    @Test
    fun test1() {
        Assert.assertEquals(2, solution.findLHS(intArrayOf(1, 2, 3, 4, 5, 6, 7)))
    }

    @Test
    fun test2() {
        Assert.assertEquals(5, solution.findLHS(intArrayOf(1, 3, 2, 2, 5, 2, 3, 7)))
    }

    @Test
    fun test3() {
        Assert.assertEquals(0, solution.findLHS(intArrayOf(1, 1, 1, 1)))
    }
}