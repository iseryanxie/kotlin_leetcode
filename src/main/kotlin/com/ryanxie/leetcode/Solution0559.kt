package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * recursively call maxDepth on each sub-tree
 */
class Solution0559 {

    class Node(var `val`: Int) {
        var children: List<Node?> = listOf()
    }
    fun maxDepth(root: Node?): Int {
        if (root == null) return 0
        return 1 + (root.children.map{maxDepth(it)}.maxOrNull() ?: 0)
    }

}
