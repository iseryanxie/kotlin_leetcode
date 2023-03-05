package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0399Test {
    private val solution = Solution0399()

    @Test
    fun test1() {
        val actual = solution.calcEquation(
            listOf(
                listOf("a", "b"),
                listOf("b", "c")
            ),
            doubleArrayOf(2.0, 3.0),
            listOf(
                listOf("a", "c"),
                listOf("b", "a"),
                listOf("a", "e"),
                listOf("a", "a"),
                listOf("x", "x")
            )
        )
        val expected = doubleArrayOf(6.0, 0.5, -1.0, 1.0, -1.0)
        Assert.assertArrayEquals(expected, actual, 0.0001)
    }

}