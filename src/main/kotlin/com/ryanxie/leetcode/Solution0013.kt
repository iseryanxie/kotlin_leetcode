package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0013 {
    fun romanToInt(s: String): Int {
        val numMap = hashMapOf<Char, Int>()
        numMap['I'] = 1
        numMap['V'] = 5
        numMap['X'] = 10
        numMap['L'] = 50
        numMap['C'] = 100
        numMap['D'] = 500
        numMap['M'] = 1000
        var prev = 0
        var sum = 0
        s.forEach {
            if (it in numMap) {
                sum += numMap.getOrElse(it) { 0 }
            } else {
                return 0
            }
            if (prev < numMap.getOrElse(it) { 0 }) {
                sum -= 2 * prev
            }
            prev = numMap.getOrElse(it) { 0 }
        }
        return sum
    }
}