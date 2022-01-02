package com.ryanxie.leetcode
/**
 * Write your thoughts here
 * at any given node, find the longer path from left + right child and the current max
 */
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
class Solution0543 {

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if (root == null) return 0
        var diameter = 0
        fun dfs(root: TreeNode?): Int{
            if (root == null) return 0
            val left = dfs(root.left)
            val right = dfs(root.right)
            diameter = maxOf(diameter, left+right)
            return maxOf(left, right) + 1
        }
        dfs(root)
        return diameter
    }
}
