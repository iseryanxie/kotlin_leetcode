package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0113 {
    fun dfs(root: TreeNode?, target: Int, path: MutableList<Int>, res: MutableList<List<Int>>) {
        if (root == null) {
            return
        }
        path.add(root.`val`)
        if (root.left == null && root.right == null && root.`val` == target) {
            res.add(path.toMutableList())
        }
        dfs(root.left, target - root.`val`, path, res)
        dfs(root.right, target - root.`val`, path, res)
        path.removeAt(path.size - 1)
    }

    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if (root == null) {
            return result
        }
        val path = mutableListOf<Int>()
        dfs(root, targetSum, path, result)
        return result
    }
}