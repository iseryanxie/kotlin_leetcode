package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0563Test{
    private val solution = Solution0563()

    @Test
    fun test1(){
        val node5 = Solution0563.TreeNode(5)
        val node3 = Solution0563.TreeNode(3)
        val node2 = Solution0563.TreeNode(2)
        node2.left = node3
        node2.right = node5
        val node7 = Solution0563.TreeNode(7)
        val node9 = Solution0563.TreeNode(9)
        node9.right = node7
        val node4 = Solution0563.TreeNode(4)
        node4.left = node2
        node4.right = node9
        Assert.assertEquals(15, solution.findTilt(node4))
    }

    @Test
    fun test2(){
        val node3 = Solution0563.TreeNode(3)
        Assert.assertEquals(0, solution.findTilt(node3))
    }

    @Test
    fun test3(){
        val node3 = Solution0563.TreeNode(3)
        val node5 = Solution0563.TreeNode(5)
        val node2 = Solution0563.TreeNode(2)
        node2.left = node3
        node2.right = node5
        Assert.assertEquals(2, solution.findTilt(node2))
    }

    @Test
    fun test4(){
        val node9 = Solution0563.TreeNode(9)
        val node7 = Solution0563.TreeNode(7)
        node9.right = node7
        Assert.assertEquals(7, solution.findTilt(node9))
    }
}