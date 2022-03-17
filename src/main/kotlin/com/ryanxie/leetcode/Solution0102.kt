package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Use a queue to stack the nodes on the same level
 */

class Solution0102 {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if (root == null) {
            return result
        }
        val queue = mutableListOf<TreeNode>()
        queue.add(root)
        while (queue.isNotEmpty()) {
            // temporarily store the nodes on the same level
            val level = mutableListOf<Int>()
            val size = queue.size
            //
            for (i in 0 until size) {
                val node = queue.removeAt(0)
                // add the node value to the level
                level.add(node.`val`)
                // add every nodes in the next level to the queue
                if (node.left != null) {
                    queue.add(node.left!!)
                }
                if (node.right != null) {
                    queue.add(node.right!!)
                }
            }
            result.add(level)
        }
        return result
    }
}
