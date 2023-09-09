package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0491 {
    fun findSubsequences(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        // path is used to store current subsequence
        val path = mutableListOf<Int>()
        dfs(nums, 0, path, result)
        return result
    }
    private fun dfs(nums: IntArray, index: Int, path: MutableList<Int>, result: MutableList<List<Int>>) {
        // if returned path has more than 2 elements to be non-decreasing subsequence
        if (path.size >= 2) {
            result.add(path.toList())
        }
        if (index >= nums.size) {
            return
        }
        // use set to avoid duplicate
        // create a new visited as empty first at this dfs level,
        // once visited in current level of dfs, no need to visit again
        val visited = mutableSetOf<Int>()
        for (i in index until nums.size) {
            if (visited.contains(nums[i])) {
                continue
            }
            // if path is empty or current element is larger than last element in path
            if (path.isEmpty() || nums[i] >= path.last()) {
                visited.add(nums[i])
                path.add(nums[i])
                dfs(nums, i + 1, path, result)
                path.removeAt(path.size - 1)
            }
        }
    }
}