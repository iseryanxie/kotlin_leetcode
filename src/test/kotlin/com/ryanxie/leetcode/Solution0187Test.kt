package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactly

class Solution0187Test{
    private val solution = Solution0187()

    @Test
    fun test1(){
        val actual = solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")
        expectThat(actual).containsExactly("AAAAACCCCC", "CCCCCAAAAA")
    }
}