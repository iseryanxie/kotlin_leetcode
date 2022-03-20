package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder
import strikt.assertions.isEqualTo

class Solution0099Test {
    private val solution = Solution0099()

    @Test
    fun test1() {
        val node1 = TreeNode(1)
        val node3 = TreeNode(3)
        val node2 = TreeNode(2)
        node1.left = node3
        node3.right = node2

        solution.recoverTree(node1)
        expectThat(node1.`val`).isEqualTo(3)
        expectThat(node1.left!!.`val`).isEqualTo(1)
        expectThat(node1.left!!.right!!.`val`).isEqualTo(2)
    }

    @Test
    fun test2() {
        val node3 = TreeNode(3)
        val node1 = TreeNode(1)
        val node4 = TreeNode(4)
        node3.left = node1
        node3.right = node4
        node4.left = TreeNode(2)
        solution.recoverTree(node3)
        expectThat(node3.`val`).isEqualTo(2)
    }
}