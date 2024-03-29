package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0657 {
    fun judgeCircle(moves: String): Boolean {
        var x = 0
        var y = 0
        for (move in moves){
            when(move){
                'U' -> y++
                'D' -> y--
                'L' -> x--
                'R' -> x++
            }
        }
        return x == 0 && y == 0
    }
}