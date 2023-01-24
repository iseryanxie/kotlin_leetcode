package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0682Test{
    private val solution = Solution0682()

    @Test
    fun test1(){
        val actual = solution.calPoints(arrayOf("5","2","C","D","+"))
        expectThat(actual).isEqualTo(30)
    }

}