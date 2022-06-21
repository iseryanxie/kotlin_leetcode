package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0216 {
    fun combinationSum3(k: Int, n: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val path = mutableListOf<Int>()
        dfs(k, n, 1, path, result)
        return result
    }
    fun dfs(k: Int, n: Int, start: Int, path: MutableList<Int>, result: MutableList<List<Int>>) {
        if (k == 0 && n == 0) {
            result.add(path.toList())
            return
        }
        if (k == 0 || n < 0) {
            return
        }
        for (i in start..9) {
            path.add(i)
            dfs(k - 1, n - i, i + 1, path, result)
            path.removeAt(path.size - 1)
        }
    }
}