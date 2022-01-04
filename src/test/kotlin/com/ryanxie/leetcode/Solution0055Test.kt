package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0055Test {
    private val solution = Solution0055()

    @Test
    fun test1() {
        Assert.assertEquals(true, solution.canJump(intArrayOf(2, 3, 1, 1, 4)))
    }

    @Test
    fun test2() {
        Assert.assertEquals(false, solution.canJump(intArrayOf(1, 0, 4)))
    }

    @Test
    fun test3() {
        Assert.assertEquals(true, solution.canJump(intArrayOf(0)))
    }

    @Test
    fun test4() {
        Assert.assertEquals(true, solution.canJump(intArrayOf(1)))
    }

    @Test
    fun test5() {
        Assert.assertEquals(true, solution.canJump(intArrayOf(2, 0, 4)))
    }
}