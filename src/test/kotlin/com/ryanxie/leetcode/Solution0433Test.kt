package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0433Test{
    private val solution = Solution0433()

    @Test
    fun test1(){
        val actual = solution.minMutation(
                "AACCGGTT",
                "AACCGGTA",
                arrayOf("AACCGGTA")
        )
        Assert.assertEquals(1, actual)
    }
}