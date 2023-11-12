package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0524Test{
    private val solution = Solution0524()

    @Test
    fun test1(){
        val actual = solution.findLongestWord("abpcplea", listOf("ale","apple","monkey","plea"))
        Assert.assertEquals("apple", actual)
    }
}