package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Not only left and right subtrees are BST, but also any node in left subtree must be less than the current node,
 * and any node in right subtree must be greater than the current node.
 */
class Solution0098 {
    fun isValidBSTMinMax(root: TreeNode?, minValue: Long, maxValue: Long): Boolean {
        if (root == null) return true
        return root.`val` > minValue && root.`val` < maxValue &&
                isValidBSTMinMax(root.left, minValue, root.`val`.toLong()) &&
                isValidBSTMinMax(root.right, root.`val`.toLong(), maxValue)
    }
    fun isValidBST(root: TreeNode?): Boolean {
        if (root == null) return true
        return isValidBSTMinMax(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }
}