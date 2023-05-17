package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0450Test {
    private val solution = Solution0450()

    @Test
    fun test1() {
        val actual = solution.deleteNode(TreeNode(5).also {
            it.left = TreeNode(3).also {
                it.left = TreeNode(2)
                it.right = TreeNode(4)
            }
            it.right = TreeNode(6).also {
                it.right = TreeNode(7)
            }
        }, 3)
        val expected = TreeNode(5).also {
            it.left = TreeNode(4).also {
                it.left = TreeNode(2)
            }
            it.right = TreeNode(6).also {
                it.right = TreeNode(7)
            }
        }
        Assert.assertEquals(expected.`val`, actual?.`val`)
        Assert.assertEquals(expected.left?.`val`, actual?.left?.`val`)
        Assert.assertEquals(expected.left?.left?.`val`, actual?.left?.left?.`val`)
        Assert.assertEquals(expected.right?.`val`, actual?.right?.`val`)
        Assert.assertEquals(expected.right?.right?.`val`, actual?.right?.right?.`val`)
    }
}