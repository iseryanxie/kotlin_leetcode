package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Use stack to calculate the last two integers with the current operator
 */
class Solution0150 {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = mutableListOf<Int>()
        for (token in tokens) {
            when (token) {
                "+" -> stack.add(stack.removeAt(stack.size - 2) + stack.removeAt(stack.size - 1))
                "-" -> stack.add(stack.removeAt(stack.size - 2) - stack.removeAt(stack.size - 1))
                "*" -> stack.add(stack.removeAt(stack.size - 2) * stack.removeAt(stack.size - 1))
                "/" -> stack.add(stack.removeAt(stack.size - 2) / stack.removeAt(stack.size - 1))
                else -> stack.add(token.toInt())
            }
        }
        return stack[0]
    }
}