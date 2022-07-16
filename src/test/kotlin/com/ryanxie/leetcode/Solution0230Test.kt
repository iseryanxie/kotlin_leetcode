package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0230Test{
    private val solution = Solution0230()

    @Test
    fun test1(){
        val node2 = TreeNode(2)
        val node1 = TreeNode(1, right = node2)
        val node4 = TreeNode(4)
        val node3 = TreeNode(3, left = node1, right = node4)

        val actual = solution.kthSmallest(node3, 1)
        expectThat(actual).isEqualTo(1)
    }

}