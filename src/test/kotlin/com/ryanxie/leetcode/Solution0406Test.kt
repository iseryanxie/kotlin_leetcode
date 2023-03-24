package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0406Test{
    private val solution = Solution0406()

    @Test
    fun test1(){
        val actual = solution.reconstructQueue(
                arrayOf(
                        intArrayOf(7,0),
                        intArrayOf(4,4),
                        intArrayOf(7,1),
                        intArrayOf(5,0),
                        intArrayOf(6,1),
                        intArrayOf(5,2)
                )
        )
        val expected = arrayOf(
                intArrayOf(5,0),
                intArrayOf(7,0),
                intArrayOf(5,2),
                intArrayOf(6,1),
                intArrayOf(4,4),
                intArrayOf(7,1)
        )
        Assert.assertArrayEquals(expected, actual)
    }
}