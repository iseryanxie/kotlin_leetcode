package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0223 {
    fun computeArea(ax1: Int, ay1: Int, ax2: Int, ay2: Int, bx1: Int, by1: Int, bx2: Int, by2: Int): Int {
        val a = (ax2 - ax1) * (ay2 - ay1)
        val b = (bx2 - bx1) * (by2 - by1)
        // max of left edges of two rectangles
        val x = Math.max(ax1, bx1)
        // max of lower edges of two rectangles
        val y = Math.max(ay1, by1)
        // min of right edges of two rectangles
        val z = Math.min(ax2, bx2)
        // min of upper edges of two rectangles
        val w = Math.min(ay2, by2)
        // z-x is the overlapping in x axis, w-y is the overlapping in y axis
        val c = if (w > y && z > x) (z - x) * (w - y) else 0
        return a + b - c
    }
}