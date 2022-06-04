package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0207Test {
    private val solution = Solution0207()

    @Test
    fun test1() {
        val actual = solution.canFinish(2, arrayOf(intArrayOf(1, 0)))
        expectThat(actual).isEqualTo(true)
    }

    @Test
    fun test2() {
        val actual = solution.canFinish(2, arrayOf(intArrayOf(1, 0), intArrayOf(0, 1)))
        expectThat(actual).isEqualTo(false)
    }
}