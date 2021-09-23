package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0013 {
    fun romanToInt(s: String): Int {
        val numMap = hashMapOf<Char, Int>(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
//        val numMap = hashMapOf<Char,Int>()
//        numMap['I'] = 1
//        numMap['V'] = 5
//        numMap['X'] = 10
//        numMap['L'] = 50
//        numMap['C'] = 100
//        numMap['D'] = 500
//        numMap['M'] = 1000
        // It is interesting that you can define an empty val hashmap
        // then initialize it. That changes the values in hashmap!!

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