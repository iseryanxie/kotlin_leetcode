package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Hashmap is NOT ordered
 * LinkedHashMap or TreeMap is ordered
 * Iteration through LinkedHashMap can be done only once.
 */
class Solution0012 {
    fun intToRoman(num: Int): String {
        val dictMap: LinkedHashMap<Int, String> = object : LinkedHashMap<Int, String>() {
            init {
                put(1000, "M")
                put(900, "CM")
                put(500, "D")
                put(400, "CD")
                put(100, "C")
                put(90, "XC")
                put(50, "L")
                put(40, "XL")
                put(10, "X")
                put(9, "IX")
                put(5, "V")
                put(4, "IV")
                put(1, "I")
            }
        }
        val sb = StringBuffer()
        var n = num
        while (n>0){
            for (e in dictMap){ // iteration is NOT reset in dictMap
                if (n>=e.key){
                    sb.append(e.value.repeat(n / e.key)) // we have to get as many letters as we needed in each iter
                    n %= e.key
                }
            }
        }
        return sb.toString()
    }
}