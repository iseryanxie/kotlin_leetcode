package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder
import strikt.assertions.isEqualTo
import strikt.assertions.isFalse
import strikt.assertions.isTrue

class Solution0134Test {
    private val solution = Solution0134()
    @Test
    fun test1(){
        val actual = solution.canCompleteCircuit(intArrayOf(1,2,3,4,5), intArrayOf(3,4,5,1,2))
        expectThat(actual).isEqualTo(3)
    }

}