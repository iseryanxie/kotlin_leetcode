package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder
import strikt.assertions.isEqualTo

class Solution0095Test {
    private val solution = Solution0095()

    @Test
    fun test1() {
        val actual = solution.generateTrees(3)
        val expected = listOf(
            TreeNode(1, null, TreeNode(3, TreeNode(2), null)),
            TreeNode(1,null, TreeNode(2,null,TreeNode(3))),
            TreeNode(2, TreeNode(1), TreeNode(3)),
            TreeNode(3, TreeNode(1, TreeNode(2))),
            TreeNode(3, TreeNode(1, null, TreeNode(2)), null)

        )
        expectThat(actual.size).isEqualTo(expected.size)
    }
}