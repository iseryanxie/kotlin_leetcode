package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0020 {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (char in s) {
            when (char) {
                '{' -> stack.addLast('}')
                '[' -> stack.addLast(']')
                '(' -> stack.addLast(')')
                else -> {
                    if (stack.isEmpty())
                        return false
                    if (stack.removeLast() != char)
                        return false
                }
            }
        }
        return stack.isEmpty()
    }
}