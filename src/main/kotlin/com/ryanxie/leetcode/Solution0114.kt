package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0114 {
    fun flatten(root: TreeNode?): Unit {
        if (root == null) {
            return
        }
        flatten(root.left)
        flatten(root.right)
        // root is still the root of the tree
        val left = root.left
        val right = root.right
        root.left = null
        root.right = left
        var cur = root
        // move to the end of the left subtree
        while (cur?.right != null) {
            cur = cur.right!!
        }
        // append the right subtree to the end of the left subtree
        if (cur != null) {
            cur.right = right
        }
    }
}