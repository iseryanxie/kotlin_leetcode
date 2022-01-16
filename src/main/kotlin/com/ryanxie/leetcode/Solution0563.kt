package com.ryanxie.leetcode

import kotlin.math.abs

/**
 * Write your thoughts here
 * use global var to keep the sum of tilt for enumerated nodes
 * use dfs to return the sum of val of all subtrees
 */
class Solution0563 {
    var tiltSum = 0
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
    fun dfs(root: TreeNode?): Int {
        if (root == null) return 0
        val leftSum = dfs(root.left)
        val rightSum = dfs(root.right)
        tiltSum += abs(leftSum - rightSum)
        return leftSum + rightSum + root.`val`
    }
    fun findTilt(root: TreeNode?): Int {
        if (root == null) return 0
        dfs(root)
        return tiltSum
    }
}
