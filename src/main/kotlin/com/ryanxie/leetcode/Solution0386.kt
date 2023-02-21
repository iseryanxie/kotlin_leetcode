package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0386 {
    fun lexicalOrder(n: Int): List<Int> {
        val result = mutableListOf<Int>()
        // start with first letter 1, 2, 3, 4, 5, 6, 7, 8, 9
        for (i in 1..9) {
            dfs(i, n, result)
        }
        return result
    }

    // search the next lexical order numbers starting with i
    private fun dfs(i: Int, n: Int, result: MutableList<Int>) {
        if (i > n) return
        result.add(i)
        for (j in 0..9) {
            val nextNum = i * 10 + j
            if (nextNum > n) break
            dfs(nextNum, n, result)
        }
    }

}