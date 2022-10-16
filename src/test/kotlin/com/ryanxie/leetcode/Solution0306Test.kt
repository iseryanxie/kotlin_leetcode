package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isTrue

class Solution0306Test{
    private val solution = Solution0306()

    @Test
    fun test1(){
        val actual = solution.isAdditiveNumber("112358")
        expectThat(actual).isTrue()
    }

    @Test
    fun test2(){
        val actual = solution.isAdditiveNumber("199100199")
        expectThat(actual).isTrue()
    }

}