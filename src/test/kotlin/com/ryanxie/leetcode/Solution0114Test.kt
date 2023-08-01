package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0114Test{
    private val solution = Solution0114()

    @Test
    fun test1(){
        val tree = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3)
                right = TreeNode(4)
            }
            right = TreeNode(5).apply {
                right = TreeNode(6)
            }
        }
        solution.flatten(tree)
        Assert.assertEquals(1, tree.`val`)
        Assert.assertEquals(2, tree.right?.`val`)
        Assert.assertEquals(3, tree.right?.right?.`val`)
        Assert.assertEquals(4, tree.right?.right?.right?.`val`)
        Assert.assertEquals(5, tree.right?.right?.right?.right?.`val`)
        Assert.assertEquals(6, tree.right?.right?.right?.right?.right?.`val`)

    }
}