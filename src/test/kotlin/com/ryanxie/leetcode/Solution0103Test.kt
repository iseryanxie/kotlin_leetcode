package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0103Test{
    private val solution = Solution0103()

    @Test
    fun test1(){
        val actual = solution.zigzagLevelOrder(TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7))))
        val expected = listOf(listOf(3), listOf(20, 9), listOf(15, 7))
        Assert.assertEquals(expected, actual)
    }

}