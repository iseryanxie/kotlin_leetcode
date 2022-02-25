package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder

class Solution0093Test {
    private val solution = Solution0093()

    @Test
    fun test1() {
        val actual = solution.restoreIpAddresses("25525511135")
        val expected = listOf("255.255.11.135", "255.255.111.35")
        expectThat(actual).containsExactlyInAnyOrder(expected)
    }

    @Test
    fun test2() {
        val actual = solution.restoreIpAddresses("101023")
        val expected = listOf("1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3")
        expectThat(actual).containsExactlyInAnyOrder(expected)
    }
}