package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0378Test{
    private val solution = Solution0378()

    @Test
    fun test1(){
        val actual = solution.kthSmallest(
            arrayOf(
                intArrayOf(1, 5, 9),
                intArrayOf(10, 11, 13),
                intArrayOf(12, 13, 15)
            ),
            8
        )
        expectThat(actual).isEqualTo(13)
    }

}