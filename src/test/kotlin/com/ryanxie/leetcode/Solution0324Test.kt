package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0324Test{
    private val solution = Solution0324()

    @Test
    fun test1(){
        val original = intArrayOf(1,5,1,1,6,4)
        solution.wiggleSort(original)
        val expected = intArrayOf(1,6,1,5,1,4)
        expectThat(original).isEqualTo(expected)
    }

}