package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0287Test{
    private val solution = Solution0287()

    @Test
    fun test1() {
        val actual = solution.findDuplicate(intArrayOf(1, 2, 3, 4, 2))
        expectThat(actual).isEqualTo(2)
    }

    @Test
    fun test2() {
        val actual = solution.findDuplicate(intArrayOf(2, 2, 2, 2, 2))
        expectThat(actual).isEqualTo(2)
    }
}