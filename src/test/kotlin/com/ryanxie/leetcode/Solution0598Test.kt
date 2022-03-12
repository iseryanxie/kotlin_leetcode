package com.ryanxie.leetcode

import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0598Test {
    private val solution = Solution0598()

    @Test
    fun test1() {
        val res = solution.maxCount(3, 3, arrayOf(intArrayOf(2, 2), intArrayOf(1, 1), intArrayOf(3, 1)))
        expectThat(res).isEqualTo(1)
    }



}