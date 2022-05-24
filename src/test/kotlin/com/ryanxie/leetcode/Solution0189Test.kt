package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0189Test {
    private val solution = Solution0189()

    @Test
    fun test1() {
        val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        solution.rotate(array, 3)
        expectThat(array).isEqualTo(intArrayOf(5, 6, 7, 1, 2, 3, 4))
    }

}