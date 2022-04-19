package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0137Test {
    private val solution = Solution0137()

    @Test
    fun test1() {
        expectThat(solution.singleNumber(intArrayOf(2, 2, 3, 2))).isEqualTo(3)
    }

}