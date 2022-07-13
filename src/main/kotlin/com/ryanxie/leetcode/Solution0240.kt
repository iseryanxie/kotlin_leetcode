package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Complexity: O(n+m)
 */
class Solution0240 {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

        if (matrix.isEmpty()) return false
        val m = matrix.size
        val n = matrix[0].size
        // start from bottom left
        var i = 0
        var j = n - 1
        while (i < m && j >= 0) {
            if (matrix[i][j] == target) return true
            // if target is smaller than current, remove the last row, because all numbers in the last row are greater
            // than current, therefore, greater than target
            if (matrix[i][j] > target) j--
            // if target is greater than current, remove the first column, because all numbers in the first column are
            // smaller than current, therefore, smaller than target
            else i++
        }
        return false
    }
}