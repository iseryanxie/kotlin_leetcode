package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0199Test{
    private val solution = Solution0199()

    @Test
    fun test1(){
        val node5 = TreeNode(5)
        val node2 = TreeNode(2, right = node5)
        val node4 = TreeNode(4)
        val node3 = TreeNode(3, right = node4)
        val node1 = TreeNode(1, left = node2, right = node3)

        val actual = solution.rightSideView(node1)
        val expected = listOf(1, 3, 4)
        expectThat(actual).isEqualTo(expected)
    }

}