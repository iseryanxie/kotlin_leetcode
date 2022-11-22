package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0337Test{
    private val solution = Solution0337()

    @Test
    fun test1(){
        val actual = solution.rob(TreeNode(3, TreeNode(2, null, TreeNode(3)), TreeNode(3, null, TreeNode(1))))
        expectThat(actual).isEqualTo(7)
    }
}