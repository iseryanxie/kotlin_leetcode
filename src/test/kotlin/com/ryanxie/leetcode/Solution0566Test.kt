package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0566Test {
    private val solution = Solution0566()

    @Test
    fun test1() {
        Assert.assertArrayEquals(arrayOf(intArrayOf(1,2,3,4)), solution.matrixReshape(
                arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(3, 4)
                ),
                1, 4
        ))
    }

    @Test
    fun test2() {
        Assert.assertArrayEquals(arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4)
        ), solution.matrixReshape(
                arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(3, 4)
                ),
                2, 4
        ))
    }

}