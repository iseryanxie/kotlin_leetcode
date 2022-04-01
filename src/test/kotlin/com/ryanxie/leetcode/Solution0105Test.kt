package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder
import strikt.assertions.isEqualTo
import strikt.assertions.isFalse
import strikt.assertions.isTrue

class Solution0105Test {
    private val solution = Solution0105()

    @Test
    fun test1() {
        val actual = solution.buildTree(intArrayOf(3, 9, 20, 15, 7), intArrayOf(9, 3, 15, 20, 7))
        if (actual != null) {
            expectThat(actual.`val`).isEqualTo(3)
            expectThat(actual.left?.`val`).isEqualTo(9)
            expectThat(actual.right?.`val`).isEqualTo(20)
            expectThat(actual.right?.left?.`val`).isEqualTo(15)
            expectThat(actual.right?.right?.`val`).isEqualTo(7)
        }

    }
}