package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0166 {
    fun fractionToDecimal(numerator: Int, denominator: Int): String {
        if (numerator == 0) return "0"
        val sign = if ((numerator > 0 && denominator > 0) || (numerator < 0 && denominator < 0)) "" else "-"
        val num: Long = Math.abs(numerator.toLong())
        val den: Long = Math.abs(denominator.toLong())
        val intPart = num / den
        var rem = num % den
        // handle the integer case
        if (rem == 0L) return sign + intPart.toString()
        val map = HashMap<Long, Int>()
        var index = 0
        var remStr = ""
        while (rem != 0L) {
            if (map.containsKey(rem)) {
                // once it starts to loop, record everything in the map within the brackets
                // take the substring from beginning to the start of the loop concatenate with the (loop)
                remStr = remStr.substring(0, map[rem]!!) + "(" + remStr.substring(map[rem]!!) + ")"
                break
            }
            map[rem] = index
            rem *= 10
            remStr += rem / den
            rem %= den
            index++
        }
        return sign + intPart.toString() + "." + remStr
    }
}