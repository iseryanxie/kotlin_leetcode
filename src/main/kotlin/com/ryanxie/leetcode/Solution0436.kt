package com.ryanxie.leetcode

import java.util.*

/**
 * Write your thoughts here
 * You are given an array of intervals, where intervals[i] = [starti, endi] and each starti is unique.
 *
 * The right interval for an interval i is an interval j such that startj >= endi and startj is minimized. Note that i may equal j.
 *
 * Return an array of right interval indices for each interval i. If no right interval exists for interval i, then put -1 at index i.
 * Use treemap
 */
class Solution0436 {
    fun findRightInterval(intervals: Array<IntArray>): IntArray {
        // use treemap to store the start and index
        val map = TreeMap<Int, Int>()
        for (i in intervals.indices) {
            map[intervals[i][0]] = i
        }
        val result = IntArray(intervals.size)
        for (i in intervals.indices) {
            // find the smallest start (key) that is larger than or equal to end
            val key = map.ceilingKey(intervals[i][1])
            result[i] = if (key == null) -1 else map[key]!!
        }
        return result
    }
}