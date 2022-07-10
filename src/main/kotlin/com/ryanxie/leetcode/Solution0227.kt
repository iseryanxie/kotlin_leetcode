package com.ryanxie.leetcode

import java.util.*

/**
 * Write your thoughts here
 */
class Solution0227 {
    fun calculate(s: String): Int {
        var current = 0
        var preSign = -1
        val stack = Stack<Int>()

        s.forEach { c ->
            if (c.isDigit()) {
                current = 10 * current + (c - '0')
            } else if (c != ' ') {

                addNum(stack, current, preSign)

                if (c == '+') {
                    preSign = 0
                } else if (c == '-') {
                    preSign = 1
                } else if (c == '*') {
                    preSign = 2
                } else if (c == '/') {
                    preSign = 3
                }
                current = 0
            }
        }

        addNum(stack, current, preSign)

        var res = 0
        stack.forEach {
            // just add the numbers in the stack
            res += it
        }
        return res

    }

    fun addNum(stack: Stack<Int>, current: Int, preSign: Int) {
        if (preSign == 0 || preSign == -1) {
            stack.push(current)
        } else if (preSign == 1) {
            stack.push(-current)
        } else if (preSign == 2) {
            // *, we can pop the last element and multiply it with current, then put it back to the stack
            stack.push(stack.pop() * current)
        } else if (preSign == 3) {
            stack.push(stack.pop() / current)
        }
    }
}