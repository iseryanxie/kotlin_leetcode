package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Consider 2D array as a single row, use / and % to find the midpoint, then apply binary search
 */
class Solution0074 {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix.isEmpty()) return false
        val numRow = matrix.size
        val numCol = matrix[0].size
        // 2D binary search
        var left = 0
        var right = numRow * numCol - 1
        while (left <= right) {
            val mid = (left + right) / 2
            val midValue = matrix[mid / numCol][mid % numCol]
            if (midValue == target) return true
            else if (midValue < target) left = mid + 1
            else right = mid - 1
        }
        return false
    }
}