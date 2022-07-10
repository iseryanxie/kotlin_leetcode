package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0227Test {
    private val solution = Solution0227()

    @Test
    fun test1() {
        val actual = solution.calculate(" 3/2 ")
        Assert.assertEquals(1, actual)
    }

    @Test
    fun test2() {
        val actual = solution.calculate("1")
        Assert.assertEquals(1, actual)
    }

    @Test
    fun test3() {
        val actual = solution.calculate("3+2*2")
        Assert.assertEquals(7, actual)
    }


    @Test
    fun test4() {
        val actual = solution.calculate("3+2*2*2")
        Assert.assertEquals(11, actual)
    }

}