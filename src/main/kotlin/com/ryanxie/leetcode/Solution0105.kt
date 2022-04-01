package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * the first element in preorder is always the root
 * split the inorder array by the root, to the left ([1,index]) is on the left subtree, to the right ([index+1,+] is on the right subtree
 * build the tree recursively
 * the first [1,index] of preorder is the preorder of the left subtree, the last [index+1,+] of preorder is the preorder of the right subtree
 */
class Solution0105 {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (preorder.isEmpty() || inorder.isEmpty()) return null
        val root = TreeNode(preorder[0])
        val index = inorder.indexOf(root.`val`)
        root.left = buildTree(preorder.sliceArray(1 until index + 1), inorder.sliceArray(0 until index))
        root.right = buildTree(preorder.sliceArray(index + 1 until preorder.size), inorder.sliceArray(index + 1 until inorder.size))
        return root
    }
}