package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0515Test{
    private val solution = Solution0515()

    @Test
    fun test1(){
        val actual = solution.largestValues(TreeNode(1).also {
            it.left = TreeNode(3).also {
                it.left = TreeNode(5)
                it.right = TreeNode(3)
            }
            it.right = TreeNode(2).also {
                it.right = TreeNode(9)
            }
        })
        Assert.assertEquals(listOf(1,3,9), actual)
    }
}