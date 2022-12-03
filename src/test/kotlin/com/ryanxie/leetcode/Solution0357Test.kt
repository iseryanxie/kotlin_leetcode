package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0357Test{
    private val solution = Solution0357()

    @Test
    fun test1(){
        expectThat(solution.numPermutations(10,1)).isEqualTo(10)
        expectThat(solution.numPermutations(10,2)).isEqualTo(90)
    }

    @Test
    fun test2(){
        expectThat(solution.countNumbersWithUniqueDigits(2)).isEqualTo(91)
    }

    @Test
    fun test3(){
        expectThat(solution.countNumbersWithUniqueDigits(0)).isEqualTo(1)
    }
}