package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0107Test{
    private val solution = Solution0107()

    @Test
    fun test1(){
        val actual = solution.levelOrderBottom(TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7))))
        Assert.assertEquals(listOf(listOf(15, 7), listOf(9, 20), listOf(3)), actual)
    }
}