package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0682 {
    fun calPoints(operations: Array<String>): Int {
        val stack = mutableListOf<Int>()
        operations.forEach { operation ->
            when (operation) {
                "C" -> stack.removeLast() //stack.removeAt(stack.lastIndex)
                "D" -> stack.add(stack.last() * 2)
                "+" -> stack.add(stack.last() + stack.elementAt(stack.lastIndex - 1))
                else -> stack.add(operation.toInt())
            }
        }
        return stack.sum()
    }
}