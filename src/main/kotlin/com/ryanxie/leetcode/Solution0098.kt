package com.ryanxie.leetcode

/**
 * Write your thoughts here
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