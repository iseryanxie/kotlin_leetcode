package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Use BFS to traverse the tree
 */
class Solution0429 {

    class Node(var `val`: Int, var children: List<Node?> = listOf()) {
    }

    fun levelOrder(root: Node?): List<List<Int>> {
        if (root == null) return listOf()
        val result = mutableListOf<List<Int>>()
        // queue to store nodes for the next level
        val queue = mutableListOf<Node>()
        queue.add(root)
        while (queue.isNotEmpty()) {
            // store the nodes in the current level
            val level = mutableListOf<Int>()
            val size = queue.size
            // enumerate the queue
            for (i in 0 until size) {
                val node = queue.removeAt(0)
                level.add(node.`val`)
                queue.addAll(node.children.filterNotNull())
            }
            result.add(level)
        }
        return result

    }

}
