package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * the operation will always add one to the (0,0) position
 * so try to find min of all op[0] and op[1]
 * the answer is how many grids that min(op[0])*min(op[1]) covered
 */
class Solution0598 {
    fun maxCount(m: Int, n: Int, ops: Array<IntArray>): Int {
        var minX = m
        var minY = n
        for (op in ops) {
            //
            minX = Math.min(minX, op[0])
            minY = Math.min(minY, op[1])
        }
        return minX * minY
    }
}