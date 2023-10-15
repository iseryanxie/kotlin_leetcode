package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0497(private val rects: Array<IntArray>) {
    private fun binarySearch(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            val mid = left + (right - left) / 2
            if (nums[mid] <= target) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left
    }

    fun pick(): IntArray {
        val n = rects.size
        // calculate the area of each rect
        val areas = IntArray(n)
        var sum = 0
        for (i in 0 until n) {
            val rect = rects[i]
            val area = (rect[2] - rect[0] + 1) * (rect[3] - rect[1] + 1)
            sum += area
            areas[i] = sum
        }
        val rand = (Math.random() * sum).toInt()
        // find which rect the rand falls into based on the area
        val index = binarySearch(areas, rand)
        // get the rect coordinates of the rect that rand falls into
        val rect = rects[index]
        // random pick a point in the rect
        val x = (Math.random() * (rect[2] - rect[0] + 1)).toInt() + rect[0]
        val y = (Math.random() * (rect[3] - rect[1] + 1)).toInt() + rect[1]
        return intArrayOf(x, y)
    }
}