package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0107 {
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if (root == null) {
            return result
        }
        val queue = mutableListOf<TreeNode>()
        queue.add(root)
        while (queue.isNotEmpty()) {
            val level = mutableListOf<Int>()
            val size = queue.size
            for (i in 0 until size) {
                // first in first out
                val node = queue.removeAt(0)
                level.add(node.`val`)
                if (node.left != null) {
                    queue.add(node.left!!)
                }
                if (node.right != null) {
                    queue.add(node.right!!)
                }
            }
            // add the whole level result to the front of the list
            result.add(0, level)
        }
        return result
    }
}