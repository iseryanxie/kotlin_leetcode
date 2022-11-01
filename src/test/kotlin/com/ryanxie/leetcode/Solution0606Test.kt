package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0606Test{
    private val solution = Solution0606()

    @Test
    fun test1(){
        val actual = solution.tree2str(TreeNode(1, TreeNode(2, TreeNode(4)), TreeNode(3)))
        expectThat(actual).isEqualTo("1(2(4))(3)")
    }
}