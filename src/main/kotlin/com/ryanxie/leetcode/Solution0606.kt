package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0606 {
    fun tree2str(t: TreeNode?): String {
        if (t == null) return ""
        val left = tree2str(t.left)
        val right = tree2str(t.right)
        if (left.isEmpty() && right.isEmpty()) return t.`val`.toString()
        if (left.isEmpty()) return "${t.`val`}()($right)"
        if (right.isEmpty()) return "${t.`val`}($left)"
        return "${t.`val`}($left)($right)"
    }
}