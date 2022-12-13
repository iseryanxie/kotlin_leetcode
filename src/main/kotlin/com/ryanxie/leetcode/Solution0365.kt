package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0365 {
    fun canMeasureWater(jug1Capacity: Int, jug2Capacity: Int, targetCapacity: Int): Boolean {
        if (jug1Capacity + jug2Capacity < targetCapacity) return false
        // targetCapacity must be a multiple of greatest common divisor of jug1Capacity and jug2Capacity
        return targetCapacity % gcd(jug1Capacity, jug2Capacity) == 0
    }
    // greatest common divisor
    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}