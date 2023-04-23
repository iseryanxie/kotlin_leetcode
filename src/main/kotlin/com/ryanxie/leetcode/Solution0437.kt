package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0437 {
    fun pathSum(root: TreeNode?, targetSum: Int): Int {
        if (root == null) {
            return 0
        }
        return pathSumFrom(root, targetSum.toLong()) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum)
    }

    private fun pathSumFrom(root: TreeNode?, targetSum: Long): Int {
        if (root == null) {
            return 0
        }
        val count = if (root.`val`.toLong() == targetSum) {
            1
        } else {
            0
        }
        return count + pathSumFrom(root.left, targetSum - root.`val`) + pathSumFrom(root.right, targetSum - root.`val`)
    }
}