package com.ryanxie.leetcode

import java.util.*

/**
 * Write your thoughts here
 * Use BFS to with level order traversal
 * BFS is implemented by using Queue
 */
class Solution0199 {
    fun rightSideView(root: TreeNode?): List<Int> {
        // BFS
        val result = mutableListOf<Int>()
        if (root == null) return result
        val queue = LinkedList<TreeNode>()
        queue.offer(root)
        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val node = queue.poll()
                // if it is the last node of the level, add it to the result
                if (i == size - 1) result.add(node.`val`)
                // add the left node to the next level queue
                if (node.left != null) queue.offer(node.left)
                // add the right node to the next level queue
                if (node.right != null) queue.offer(node.right)
            }
        }
        return result
    }
}