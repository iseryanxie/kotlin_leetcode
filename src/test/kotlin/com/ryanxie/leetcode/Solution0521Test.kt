package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0521Test {
    private val solution = Solution0521()

    @Test
    fun test1() {
        val res = solution.findLUSlength("aba", "cdc")
        expectThat(res).isEqualTo(3)
    }


}