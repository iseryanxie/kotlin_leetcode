package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0165Test{
    private val solution = Solution0165()

    @Test
    fun test1(){
        val actual = solution.compareVersion("0.1", "1.1")
        expectThat(actual).isEqualTo(-1)
    }

    @Test
    fun test2(){
        val actual = solution.compareVersion("1.01", "1.001")
        expectThat(actual).isEqualTo(0)
    }

}