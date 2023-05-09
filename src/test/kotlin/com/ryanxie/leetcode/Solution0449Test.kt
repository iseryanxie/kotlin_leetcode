package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0449Test{
    private val solution = Solution0449()

    @Test
    fun test1(){
        val actual = solution.serialize(TreeNode(1, TreeNode(2), TreeNode(3)))
        Assert.assertEquals("1,2,null,null,3,null,null,", actual)
    }

}