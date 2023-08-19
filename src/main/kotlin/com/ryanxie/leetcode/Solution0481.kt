package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0481 {
    fun magicalString(n: Int): Int {
        if (n == 0) {
            return 0
        }
        if (n <= 3) {
            return 1
        }
        var result = 1
        var head = 2 // head is the current index of the magical string
        var tail = 3 // tail is the index of the next number to be added
        var num = 1 // num is the number to be added to the magical string
        val arr = IntArray(n + 1) // arr is the magical string
        arr[0] = 1
        arr[1] = 2
        arr[2] = 2
        while (tail < n) {
            for (i in 0 until arr[head]) { // add arr[head] number of num to the magical string
                arr[tail] = num
                if (num == 1 && tail < n) {
                    result++ // count the number of 1s
                }
                tail++ // move the tail to the next index
            }
            // flip the number to be added between 1 and 2
            num = if (num == 1) 2 else 1
            head++ // move the head to the next index
        }
        return result
    }
}