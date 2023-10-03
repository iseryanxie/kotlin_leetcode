package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0508Test{
    private val solution = Solution0508()

    @Test
    fun test1(){
        val actual = solution.findFrequentTreeSum(TreeNode(5).apply {
            left = TreeNode(2)
            right = TreeNode(-3)
        })
        Assert.assertArrayEquals(intArrayOf(2, -3, 4), actual)
    }
}