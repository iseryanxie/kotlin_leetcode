package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0417 {
    fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if (heights.isEmpty()) {
            return result
        }
        val m = heights.size
        val n = heights[0].size
        // whether a cell can flow to pacific/atlantic
        val pacific = Array(m) { BooleanArray(n) }
        val atlantic = Array(m) { BooleanArray(n) }
        // only need to dfs from the boundary cells
        for (i in 0 until m) {
            // start from the boundary cells of first column, because the first column is closest to the pacific
            dfs(heights, pacific, Int.MIN_VALUE, i, 0)
            // start from the boundary cells of last column, because the last column is closest to the atlantic
            dfs(heights, atlantic, Int.MIN_VALUE, i, n - 1)
        }
        for (i in 0 until n) {
            // start from the first row
            dfs(heights, pacific, Int.MIN_VALUE, 0, i)
            // start from the last row
            dfs(heights, atlantic, Int.MIN_VALUE, m - 1, i)
        }
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(listOf(i, j))
                }
            }
        }
        return result
    }
    // preHeight is the height of the previous cell
    private fun dfs(heights: Array<IntArray>, visited: Array<BooleanArray>, preHeight: Int, x: Int, y: Int) {
        val m = heights.size
        val n = heights[0].size
        // if out of bound, or already visited, or the height of the current cell is lower than the previous cell
        // then cannot flow to the current cell
        if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y] || heights[x][y] < preHeight) {
            return
        }
        // mark the current cell as visited
        visited[x][y] = true
        // dfs to all four adjacent cells
        dfs(heights, visited, heights[x][y], x + 1, y)
        dfs(heights, visited, heights[x][y], x - 1, y)
        dfs(heights, visited, heights[x][y], x, y + 1)
        dfs(heights, visited, heights[x][y], x, y - 1)
    }
}