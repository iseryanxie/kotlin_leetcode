package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder

class Solution0113Test {
    private val solution = Solution0113()

    @Test
    fun test1() {
        val node5 = TreeNode(5)
        val node4 = TreeNode(4)
        val node8 = TreeNode(8)
        node5.left = node4
        node5.right = node8
        val node11 = TreeNode(11)
        node4.left = node11
        val node13 = TreeNode(13)
        val node7 = TreeNode(7)
        node11.left = node7
        val node2 = TreeNode(2)
        node11.right = node2
        node8.left = node13
        val node1 = TreeNode(1)
        val node4_2 = TreeNode(4)
        node8.right = node4_2
        val node5_2 = TreeNode(5)
        node4_2.left = node5_2
        node4_2.right = node1
        val expected = listOf(listOf(5, 4, 11, 2), listOf(5, 8, 4, 5))
        val actual = solution.pathSum(node5, 22)
        expectThat(actual).containsExactlyInAnyOrder(expected)
    }

    @Test
    fun test2() {
        val node1 = TreeNode(1)
        val node2 = TreeNode(2)
        node1.left = node2
        val expected: List<List<Int>> = listOf()
        val actual = solution.pathSum(node1, 1)
        expectThat(actual).containsExactlyInAnyOrder(expected)
    }
}