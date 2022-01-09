package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0057Test {
    private val solution = Solution0057()

    @Test
    fun test1() {
        val nums = arrayOf(intArrayOf(1, 3), intArrayOf(6, 9))
        val res = solution.insert(nums, intArrayOf(2, 5))
        Assert.assertArrayEquals(arrayOf(intArrayOf(1, 5), intArrayOf(6, 9)), res)
    }

    @Test
    fun test2() {
        //[[1,2],[3,5],[6,7],[8,10],[12,16]]
        val nums = arrayOf(intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(6, 7), intArrayOf(8, 10), intArrayOf(12, 16))
        // insert [4,8]
        val res = solution.insert(nums, intArrayOf(4, 8))
        // expect [[1,2],[3,10],[12,16]]
        Assert.assertArrayEquals(arrayOf(intArrayOf(1, 2), intArrayOf(3, 10), intArrayOf(12, 16)), res)
    }
}