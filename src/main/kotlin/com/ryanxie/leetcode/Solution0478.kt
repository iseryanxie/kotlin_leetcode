package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0478(private val radius: Double, private val x_center: Double, private val y_center: Double) {
    fun randPoint(): DoubleArray {
        val r = Math.sqrt(Math.random()) * radius
        val theta = Math.random() * 2 * Math.PI
        val x = x_center + r * Math.cos(theta)
        val y = y_center + r * Math.sin(theta)
        return doubleArrayOf(x, y)
    }
}