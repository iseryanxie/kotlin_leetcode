package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder
import strikt.assertions.isEqualTo
import strikt.assertions.isFalse
import strikt.assertions.isTrue

class Solution0098Test {
    private val solution = Solution0098()

    @Test
    fun test1() {
        val binaryTree = TreeNode(5, TreeNode(1), TreeNode(4, TreeNode(3), TreeNode(6)))
        val actual = solution.isValidBST(binaryTree)
        expectThat(actual).isFalse()
    }

    @Test
    fun test2() {
        val binaryTree = TreeNode(3, TreeNode(1), TreeNode(5, TreeNode(4), TreeNode(6)))
        val actual = solution.isValidBST(binaryTree)
        expectThat(actual).isTrue()
    }

    @Test
    fun test3() {
        val binaryTree = TreeNode(5, TreeNode(4), TreeNode(6, TreeNode(3), TreeNode(7)))
        val actual = solution.isValidBST(binaryTree)
        expectThat(actual).isFalse()
    }

    @Test
    fun test4() {
        val binaryTree = TreeNode(-2147483648, null, TreeNode(2147483647))
        val actual = solution.isValidBST(binaryTree)
        expectThat(actual).isTrue()
    }
}