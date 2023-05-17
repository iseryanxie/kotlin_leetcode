package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0450 {
    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
        if (root == null) {
            return null
        }
        if (root.`val` == key) {
            // root is the key, need to delete root
            if (root.left == null) {
                return root.right
            }
            if (root.right == null) {
                return root.left
            }
            // both left and right subtree exist, find the min node in right subtree to replace root
            val minNode = findMin(root.right)
            root.`val` = minNode.`val`
            root.right = deleteNode(root.right, minNode.`val`)
        } else if (root.`val` > key) {
            // key is in left subtree
            root.left = deleteNode(root.left, key)
        } else {
            // key is in right subtree
            root.right = deleteNode(root.right, key)
        }
        return root
    }

    private fun findMin(root: TreeNode?): TreeNode {
        var node = root
        while (node?.left != null) {
            node = node.left
        }
        return node!!
    }
}