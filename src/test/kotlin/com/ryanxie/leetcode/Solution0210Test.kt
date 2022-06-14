package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0210Test {
    private val solution = Solution0210()

    @Test
    fun test1() {
        val actual = solution.findOrder(2, arrayOf(intArrayOf(0, 1)))
        expectThat(actual).isEqualTo(intArrayOf(1, 0))
    }

    @Test
    fun test2() {
        //[1,0],[2,0],[3,1],[3,2]
        val actual =
            solution.findOrder(4, arrayOf(intArrayOf(1, 0), intArrayOf(2, 0), intArrayOf(3, 1), intArrayOf(3, 2)))
        expectThat(actual).isEqualTo(intArrayOf(0, 1, 2, 3))
    }

    @Test
    fun test3() {
        val actual =
            solution.findOrder(1, arrayOf())
        expectThat(actual).isEqualTo(intArrayOf(0))
    }

}