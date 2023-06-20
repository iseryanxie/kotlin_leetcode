package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Use BFS to traverse the tree level by level.
 */
class Solution0103 {
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if (root == null) {
            return result
        }
        val queue = mutableListOf<TreeNode>()
        queue.add(root)
        var isLeftToRight = true
        while (queue.isNotEmpty()) {
            val size = queue.size
            val level = mutableListOf<Int>()
            for (i in 0 until size) {
                val node = queue.removeAt(0)
                if (isLeftToRight) {
                    level.add(node.`val`)
                } else {
                    // from right to left, so add the right to the front of the list
                    level.add(0, node.`val`)
                }
                if (node.left != null) {
                    queue.add(node.left!!)
                }
                if (node.right != null) {
                    queue.add(node.right!!)
                }
            }
            result.add(level)
            isLeftToRight = !isLeftToRight
        }
        return result
    }
}