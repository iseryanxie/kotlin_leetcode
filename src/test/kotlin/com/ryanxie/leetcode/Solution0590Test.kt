package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class Solution0590Test {
    private val solution = Solution0590()

    @Test
    fun test1() {
        val node1 = Solution0590.Node(1)
        val node2 = Solution0590.Node(2)
        val node3 = Solution0590.Node(3)
        val node4 = Solution0590.Node(4)
        val node5 = Solution0590.Node(5)
        val node6 = Solution0590.Node(6)
        node1.children = listOf(node3, node2, node4)
        node3.children = listOf(node5, node6)
        assertEquals(listOf(5, 6, 3, 2, 4, 1), solution.postorder(node1))
    }
}