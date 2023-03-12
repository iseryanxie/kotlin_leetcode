package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0393 {
    fun validUtf8(data: IntArray): Boolean {
        var i = 0
        while (i < data.size) {
            val num = data[i]
            if (num and 0b10000000 == 0) {
                // matches 0xxxxxxx, move on the next digit
                i++
            } else if (num and 0b11100000 == 0b11000000) {
                // matches 110xxxxx 10xxxxxx, move on the next two digits
                // 0b11100000 is 11100000, 0b11000000 is 11000000
                // mask num with 11100000, you get XXX00000 and compare it with 11000000, to make sure the number is 110xxxxx
                if (i + 1 >= data.size) return false
                // similarly mask data[i + 1] with 11000000, you get 10XXXXXX and compare it with 10000000, to make sure the number is 10xxxxxx
                if (data[i + 1] and 0b11000000 != 0b10000000) return false
                i += 2
            } else if (num and 0b11110000 == 0b11100000) {
                // matches 1110xxxx 10xxxxxx 10xxxxxx
                if (i + 2 >= data.size) return false
                if (data[i + 1] and 0b11000000 != 0b10000000) return false
                if (data[i + 2] and 0b11000000 != 0b10000000) return false
                i += 3
            } else if (num and 0b11111000 == 0b11110000) {
                if (i + 3 >= data.size) return false
                if (data[i + 1] and 0b11000000 != 0b10000000) return false
                if (data[i + 2] and 0b11000000 != 0b10000000) return false
                if (data[i + 3] and 0b11000000 != 0b10000000) return false
                i += 4
            } else {
                return false
            }
        }
        return true
    }
}