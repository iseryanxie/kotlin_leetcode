package com.ryanxie.leetcode
/**
 * Write your thoughts here
 * for each interval, if end of the interval earlier than the start, then add to result
 * start of the interval is later than the end, then add to result
 * otherwise, there are overlap, find the min start and max end of these overlap intervals,
 * add to the result
 * Note: make sure the list of still sorted in start time
 */
class Solution0057 {

    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val result = ArrayList<IntArray>()
        var start = newInterval[0]
        var end = newInterval[1]
        val append = ArrayList<IntArray>()
        intervals.forEach {
            if (it[1] < start) {
                result.add(it)
            } else if (it[0] > end) {
                append.add(it)
            } else {
                start = Math.min(start, it[0])
                end = Math.max(end, it[1])
            }
        }
        result.add(intArrayOf(start, end))
        append.forEach {
            result.add(it)
        }
        return result.toTypedArray()
    }
}
