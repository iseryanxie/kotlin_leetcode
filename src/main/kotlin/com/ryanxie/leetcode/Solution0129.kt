package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0129 {
    fun sumNumbers(root: TreeNode?): Int {
        return sumNumbers(root, 0)
    }

    private fun sumNumbers(root: TreeNode?, sum: Int): Int {
        if (root == null) return 0
        val newSum = sum * 10 + root.`val`
        if (root.left == null && root.right == null) return newSum
        return sumNumbers(root.left, newSum) + sumNumbers(root.right, newSum)
    }

}