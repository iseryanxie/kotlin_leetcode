package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0220Test{
    private val solution = Solution0220()

    @Test
    fun test1(){
        val actual = solution.containsNearbyAlmostDuplicate(intArrayOf(1,2,3,1), 3, 0)
        expectThat(actual).isEqualTo(true)
    }
}