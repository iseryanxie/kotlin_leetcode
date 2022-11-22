package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Recursion + Memoization
 */
class Solution0337 {
    fun rob(root: TreeNode?): Int {
        // map of node to max value
        val memo = mutableMapOf<TreeNode?, Int>()
        return rob(root, memo)
    }
    private fun rob(root: TreeNode?, memo: MutableMap<TreeNode?, Int>): Int {
        if (root == null) return 0
        if (memo.containsKey(root)) return memo[root]!!
        val robRoot = root.`val` + (root.left?.let { rob(it.left, memo) + rob(it.right, memo) } ?: 0) + (root.right?.let { rob(it.left, memo) + rob(it.right, memo) } ?: 0)
        val notRobRoot = rob(root.left, memo) + rob(root.right, memo)
        val result = Math.max(robRoot, notRobRoot)
        memo[root] = result
        return result
    }
}