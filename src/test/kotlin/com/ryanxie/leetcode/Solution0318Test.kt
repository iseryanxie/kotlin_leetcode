package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0318Test{
    private val solution = Solution0318()

    @Test
    fun test1(){
        val actual = solution.maxProduct(arrayOf("abcw","baz","foo","bar","xtfn","abcdef"))
        expectThat(actual).isEqualTo(16)
    }
}