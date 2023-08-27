package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * binary search on smallest speed k
 */
class Solution0875 {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var left = 1
        var right = piles.maxOrNull()!!
        while (left < right) {
            val mid = left + (right - left) / 2
            if (canEatAll(piles, h, mid)) {
                right = mid // mid can be the answer
            } else {
                left = mid + 1
            }
        }
        return left
    }

    private fun canEatAll(piles: IntArray, h: Int, k: Int): Boolean {
        var time = 0
        piles.forEach {
            time += (it - 1) / k + 1
        }
        return time <= h
    }
}