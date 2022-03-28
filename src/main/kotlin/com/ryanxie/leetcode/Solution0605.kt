package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * every 3 consecutive zeros between 1s can place 1 more flower
 */
class Solution0605 {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count = 0
        // assume there's dummy 0 to the left of first spot, because 0,0,1 can place 1 flower to the first 0
        var consecZeros = 1
        for (i in flowerbed.indices) {
            if (flowerbed[i] == 0) {
                consecZeros++
            } else {
                consecZeros = 0
            }
            if (consecZeros == 3) {
                count++
                consecZeros = 1
            }
        }
        // in the end, only requires 2 consec zeros, because 1, 0, 0, can place 1 flower to the last 0
        if (consecZeros == 2) {
            count++
        }
        return count >= n
    }
}