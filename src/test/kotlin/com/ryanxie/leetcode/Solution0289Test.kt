package com.ryanxie.leetcode

import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isTrue

class Solution0289Test{
    private val solution = Solution0289()

    @Test
    fun test1(){
        val original = arrayOf(
            intArrayOf(0,1,0),
            intArrayOf(0,0,1),
            intArrayOf(1,1,1),
            intArrayOf(0,0,0)
        )
        solution.gameOfLife(original)
        val expected = arrayOf(
            intArrayOf(0,0,0),
            intArrayOf(1,0,1),
            intArrayOf(0,1,1),
            intArrayOf(0,1,0)
        )
        expectThat(original contentDeepEquals expected).isTrue()

    }

}