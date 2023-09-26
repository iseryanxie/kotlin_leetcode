package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * BFS
 */
class Solution0515 {
    fun largestValues(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        if (root == null) {
            return result
        }
        val queue = mutableListOf<TreeNode>()
        queue.add(root)
        while (queue.isNotEmpty()) {
            val size = queue.size
            // find max in current level
            var max = Int.MIN_VALUE
            for (i in 0 until size) {
                val node = queue.removeAt(0)
                max = maxOf(max, node.`val`)
                if (node.left != null) {
                    queue.add(node.left!!)
                }
                if (node.right != null) {
                    queue.add(node.right!!)
                }
            }
            result.add(max)
        }
        return result
    }
}