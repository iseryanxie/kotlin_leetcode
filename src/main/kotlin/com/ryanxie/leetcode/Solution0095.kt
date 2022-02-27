package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * call dfs recursion on left and right of the tree node
 */
class Solution0095 {
    fun generateTrees(n: Int): List<TreeNode?> {
        fun dfs(start: Int, end: Int): List<TreeNode?> {
            val result = mutableListOf<TreeNode?>()
            if (start > end) {
                return listOf(null)
            }
            for (i in start..end) {
                val left = dfs(start, i - 1)
                val right = dfs(i + 1, end)
                for (l in left) {
                    for (r in right) {
                        val root = TreeNode(i)
                        root.left = l
                        root.right = r
                        result.add(root)
                    }
                }
            }
            return result
        }
        return if (n == 0) listOf(null) else dfs(1, n)

    }
}