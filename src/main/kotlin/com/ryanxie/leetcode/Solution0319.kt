package com.ryanxie.leetcode

import kotlin.math.sqrt

/**
 * Write your thoughts here
 * only numbers that are perfect squares can have odd number of factors
 * so they will remain on, otherwise they will be turned off, because they have even number of factors
 * prime: (1,n) two flips
 * perfect square: sqrt(n) odd number of flips
 * other non-prime: e.g., 8->(1,8),(2,4),(4,2),(8,1) four flips
 */
class Solution0319 {
    fun bulbSwitch(n: Int): Int {
        return sqrt(n.toDouble()).toInt()
    }
}