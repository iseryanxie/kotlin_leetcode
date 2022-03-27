package com.ryanxie.leetcode
/**
 * Write your thoughts here
 */

class Solution0120 {
    fun minimumTotal(triangle: List<List<Int>>): Int {
        // the last row is the minimum path sum of the end nodes
        val dp = triangle.last().toMutableList()
        // starting from the second last row to the first row
        for (i in triangle.size - 2 downTo 0) {
            for (j in 0 until triangle[i].size) {
                // for each node in the level, the minimum path sum is the sum of the current node + the minimum path sum of the two children
                // because we start from the end, we are only using the first n nodes in the level and don't care about the rest
                dp[j] = triangle[i][j] + minOf(dp[j], dp[j + 1])
            }
        }
        return dp[0]
    }
}
