package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0429Test {
    private val solution = Solution0429()

    @Test
    fun test1() {
        val actual = solution.levelOrder(
            Solution0429.Node(
                1,
                listOf(
                    Solution0429.Node(3, listOf(Solution0429.Node(5), Solution0429.Node(6))),
                    Solution0429.Node(2),
                    Solution0429.Node(4)
                )
            )
        )
        Assert.assertEquals(
            listOf(
                listOf(1),
                listOf(3, 2, 4),
                listOf(5, 6)
            ),
            actual
        )
    }
}