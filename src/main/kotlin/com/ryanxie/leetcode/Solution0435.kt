package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0435 {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        if (intervals.isEmpty()) return 0
        // sort the interval by the end of each interval
        intervals.sortBy { it[1] }
        var count = 0
        var end = intervals[0][1]
        for (i in 1 until intervals.size) {
            if (intervals[i][0] < end) {
                // new interval starts before the previous one ends, detected overlap
                count++
            } else {
                // no overlap, update the end to the new end
                // because it's already sorted by the end, the new end is always larger than the previous end
                end = intervals[i][1]
            }
        }
        return count
    }
}