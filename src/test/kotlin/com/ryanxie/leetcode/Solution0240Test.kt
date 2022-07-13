package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0240Test{
    private val solution = Solution0240()

    @Test
    fun test1(){
        //[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]
        val actual = solution.searchMatrix(arrayOf(
            intArrayOf(1,4,7,11,15),
            intArrayOf(2,5,8,12,19),
            intArrayOf(3,6,9,16,22),
            intArrayOf(10,13,14,17,24),
            intArrayOf(18,21,23,26,30)
        ), 5)
        expectThat(actual).isEqualTo(true)
    }
}