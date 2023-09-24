package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0513Test{
    private val solution = Solution0513()

    @Test
    fun test1(){
        val actual = solution.findBottomLeftValue(TreeNode(2, TreeNode(1), TreeNode(3)))
        Assert.assertEquals(1, actual)
    }
}