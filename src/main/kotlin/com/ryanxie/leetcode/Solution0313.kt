package com.ryanxie.leetcode

import java.util.*

/**
 * Write your thoughts here
 * keep index of each prime
 */
class Solution0313 {
    fun nthSuperUglyNumber(n: Int, primes: IntArray): Long {
        val ugly = LongArray(n)
        ugly[0] = 1
        val index = IntArray(primes.size)
        for (i in 1 until n) {
            var min = Long.MAX_VALUE
            for (j in primes.indices) {
                min = min.coerceAtMost((primes[j] * ugly[index[j]]))
            }
            ugly[i] = min
            for (j in primes.indices) {
                if (min == primes[j] * ugly[index[j]]) {
                    index[j]++
                }
            }
        }
        return ugly[n - 1]
    }
}