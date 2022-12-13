package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0661 {
    fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
        val m = img.size
        val n = img[0].size
        val result = Array(m) { IntArray(n) }
        for (i in 0 until m) {
            for (j in 0 until n) {
                var count = 0
                var sum = 0
                for (x in -1..1) {
                    for (y in -1..1) {
                        if (i + x in 0 until m && j + y in 0 until n) {
                            count++
                            sum += img[i + x][j + y]
                        }
                    }
                }
                result[i][j] = sum / count
            }
        }
        return result
    }
}