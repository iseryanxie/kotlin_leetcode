package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Use BFS to traverse the tree level by level, and return the last node value of the last level
 */
class Solution0513 {
    fun findBottomLeftValue(root: TreeNode?): Int {
        val queue = mutableListOf<TreeNode>()
        queue.add(root!!)
        var result = root.`val`
        while (queue.isNotEmpty()) {
            val size = queue.size
            // save the first node value of each level
            result = queue.first().`val`
            for (i in 0 until size) {
                // remove each node of each level from the queue
                val node = queue.removeAt(0)
                // add the left and right child of each node to the queue
                if (node.left != null) {
                    queue.add(node.left!!)
                }
                if (node.right != null) {
                    queue.add(node.right!!)
                }
            }
        }
        return result
    }
}