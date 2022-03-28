package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isFalse
import strikt.assertions.isTrue

class Solution0605Test {
    private val solution = Solution0605()

    @Test
    fun test1() {
        expectThat(solution.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 1)).isTrue()
    }

    @Test
    fun test2() {
        expectThat(solution.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 2)).isFalse()
    }

    @Test
    fun test3() {
        expectThat(solution.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 0, 0, 1), 2)).isTrue()
    }

    @Test
    fun test4() {
        expectThat(solution.canPlaceFlowers(intArrayOf(0, 0, 1, 0, 1), 1)).isTrue()
    }
}