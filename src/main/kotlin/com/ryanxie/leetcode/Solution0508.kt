package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0508 {
    fun findFrequentTreeSum(root: TreeNode?): IntArray {
        // store sum and count for each subtree
        val map = mutableMapOf<Int, Int>()
        val result = mutableListOf<Int>()
        dfs(root, map)
        val max = map.values.maxOrNull()
        map.forEach { (k, v) ->
            // add all the sum with max count
            if (v == max) {
                result.add(k)
            }
        }
        return result.toIntArray()
    }

    // use dfs to calculate sum for each subtree
    private fun dfs(root: TreeNode?, map: MutableMap<Int, Int>): Int {
        if (root == null) {
            return 0
        }
        val left = dfs(root.left, map)
        val right = dfs(root.right, map)
        // sum is the sum of left subtree, right subtree and root
        val sum = left + right + root.`val`
        // update map
        map[sum] = map.getOrDefault(sum, 0) + 1
        return sum
    }
}