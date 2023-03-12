package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * There are 9 numbers with 1 digit, 90 numbers with 2 digits, 900 numbers with 3 digits, 9000 numbers with 4 digits, etc.
 */
class Solution0400 {
    fun findNthDigit(n: Int): Int {
        var n = n
        // track the current digit number, say 1, 2, 3, 4, etc.
        var digit = 1
        // track the start of current digit number, say 1, 10, 100, 1000, etc.
        var start = 1
        var base = 9L
        while (n > digit* base) {
            n -= (digit * base).toInt()
            // if n is big enough, move to next digit
            digit++
            // start of next digit is 10 times of current start, say 1 -> 10 -> 100 -> 1000, etc.
            start *= 10
            // how many numbers in next digit, say 9 -> 90 -> 900 -> 9000, etc.
            base *= 10
        }
        // at this point, we know the digit and start of the number
        // find which number in this range (e.g., 10-99, 100-999, etc.) has the nth digit
        val num = start + (n - 1) / digit
        // convert the number to string and pick the location of the number by taking modulo and restore the digit from string to int
        return num.toString()[(n - 1) % digit] - '0'
    }
}