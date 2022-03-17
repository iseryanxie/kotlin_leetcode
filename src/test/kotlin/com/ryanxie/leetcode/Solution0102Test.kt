package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0102Test{
    private val solution = Solution0102()

    @Test
    fun test1(){
        val actual = solution.levelOrder(TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        })
        val expected = listOf(
            listOf(3),
            listOf(9, 20),
            listOf(15, 7)
        )
        expectThat(actual).isEqualTo(expected)
    }
}