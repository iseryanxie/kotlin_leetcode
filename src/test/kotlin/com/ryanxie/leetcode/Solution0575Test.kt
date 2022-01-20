package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0575Test {
    private val solution = Solution0575()

    @Test
    fun test1() {
        Assert.assertEquals(3, solution.distributeCandies(intArrayOf(1, 1, 2, 2, 3, 3)))
    }

    @Test
    fun test2() {
        Assert.assertEquals(2, solution.distributeCandies(intArrayOf(1, 1, 2, 3)))
    }

    @Test
    fun test3() {
        Assert.assertEquals(1, solution.distributeCandies(intArrayOf(6, 6, 6, 6)))
    }

}