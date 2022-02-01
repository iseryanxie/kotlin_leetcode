package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * dp bottom-up
 */
class Solution0063 {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val m = obstacleGrid.size
        val n = obstacleGrid[0].size
        val dp = Array(m) { IntArray(n) }
        dp[0][0] = if (obstacleGrid[0][0] == 1) 0 else 1
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0
                } else if (i == 0 && j == 0) {
                    continue
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1]
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j]
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
                }
            }
        }
        return dp[m-1][n-1]
    }

}