package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0543Test{
    private val solution = Solution0543()

    @Test
    fun test1(){
        val node5 = Solution0543.TreeNode(5)
        val node4 = Solution0543.TreeNode(4)
        val node3 = Solution0543.TreeNode(3)
        val node2 = Solution0543.TreeNode(2)
        node2.left = node4
        node2.right = node5
        val node1 = Solution0543.TreeNode(1)
        node1.left = node2
        node1.right = node3
        Assert.assertEquals(3, solution.diameterOfBinaryTree(node1))
    }
}