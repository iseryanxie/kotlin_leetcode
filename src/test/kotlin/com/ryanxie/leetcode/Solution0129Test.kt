package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0129Test{
    private val solution = Solution0129()

    @Test
    fun test1(){
        val actual = solution.sumNumbers(
                TreeNode(1,
                        TreeNode(2),
                        TreeNode(3)
                )
        )
        expectThat(actual).isEqualTo(25)
    }

}