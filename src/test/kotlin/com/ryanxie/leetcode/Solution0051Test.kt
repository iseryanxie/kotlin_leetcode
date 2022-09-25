package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0051Test{
    private val solution = Solution0051()

    @Test
    fun test1(){
        val actual = solution.solveNQueens(4)
        val expected = listOf(
            listOf(".Q..","...Q","Q...","..Q."),
            listOf("..Q.","Q...","...Q",".Q..")
        )
        expectThat(actual).isEqualTo(expected)
    }

}