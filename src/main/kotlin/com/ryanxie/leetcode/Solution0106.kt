package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Similar to LC105
 * First find root, then split the inorder and postorder into two subtrees at the index of the root
 * Then recursively build the two subtrees
 */
class Solution0106 {
    fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
        if (inorder.isEmpty() || postorder.isEmpty()) return null
        val root = TreeNode(postorder.last())
        val index = inorder.indexOf(root.`val`)
        root.left = buildTree(inorder.sliceArray(0 until index), postorder.sliceArray(0 until index))
        root.right = buildTree(
            inorder.sliceArray(index + 1 until inorder.size),
            postorder.sliceArray(index until postorder.size - 1)
        )
        return root
    }
}