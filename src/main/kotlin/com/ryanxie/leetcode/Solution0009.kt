package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * 1. use string to reverse (can terminate early because reverse one digit at a time
 * 2. use digit modulo
 */
class Solution0009 {
    //    fun isPalindrome(x: Int): Boolean {
//        if (x<0) {
//            return false
//        }
//        val x_str = x.toString()
//        for (i in 0 .. x_str.length/2){
//            if (x_str[i] != x_str[x_str.length-1-i]) return false
//        }
//        return true
//    }
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        var num = x
        var reversed = 0
        while (num > 0) {
            val mod = num % 10
            reversed = 10 * reversed + mod
            num = num / 10
        }
        return reversed == x
    }
}