package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0475 {
    fun findRadius(houses: IntArray, heaters: IntArray): Int {
        houses.sort()
        heaters.sort()
        var i = 0
        var j = 0
        var res = 0
        while (i < houses.size) {
            while (j < heaters.size - 1 && Math.abs(heaters[j + 1] - houses[i]) <= Math.abs(heaters[j] - houses[i])) {
                // find the closest heater, j+1 is closer than j
                j++
            }
            // find the max distance between the house and the closest heater
            res = Math.max(res, Math.abs(heaters[j] - houses[i]))
            i++
        }
        return res
    }
}