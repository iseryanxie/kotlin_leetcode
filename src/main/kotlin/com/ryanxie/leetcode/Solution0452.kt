package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * find the number of non-overlapping intervals
 */
class Solution0452 {
    fun findMinArrowShots(points: Array<IntArray>): Int {
        if (points.isEmpty()) {
            return 0
        }
        // sort by end point
        points.sortBy { it[1] }
        var count = 1
        var end = points[0][1]
        for (i in 1 until points.size) {
            // if start point is larger than end point, then we need another arrow
            if (points[i][0] > end) {
                count++
                end = points[i][1]
            }
        }
        return count
    }
}