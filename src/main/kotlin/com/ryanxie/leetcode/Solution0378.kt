package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0378 {
    fun kthSmallest(matrix: Array<IntArray>, k: Int): Int {
        var low = matrix[0][0]
        var high = matrix[matrix.size - 1][matrix[0].size - 1]
        while (low < high) {
            val mid = low + (high - low) / 2
            if (countSmallerOrEqual(matrix, mid) < k) { // number of matrix elements <= mid is less than k
                low = mid + 1
            } else {
                high = mid
            }
        }
        return low
    }
    // similar to leetcode 240
    private fun countSmallerOrEqual(matrix: Array<IntArray>, target: Int): Int {
        var count = 0
        // start from lower left corner
        var i = matrix.size - 1
        var j = 0
        while (i >= 0 && j < matrix[0].size) {
            if (matrix[i][j] <= target) {
                // all elements above the current element are smaller than target
                count += i + 1
                // move right
                j++
            } else {
                // move up
                i--
            }
        }
        return count
    }
}