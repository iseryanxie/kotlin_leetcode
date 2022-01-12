package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0561Test {
    private val solution = Solution0561()

    @Test
    fun test1() {
        val res = solution.arrayPairSum(intArrayOf(2, 5))
        Assert.assertEquals(2, res)
    }

    @Test
    fun test2() {
        val res = solution.arrayPairSum(intArrayOf(1,4,3,2))
        Assert.assertEquals(4, res)
    }

    @Test
    fun test3() {
        val res = solution.arrayPairSum(intArrayOf(6,2,6,5,1,2))
        Assert.assertEquals(9, res)
    }

}