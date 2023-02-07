package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0394 {
    fun decodeString(s: String): String {
        val stack = mutableListOf<String>()
        var i = 0
        while (i < s.length) {
            if (s[i] == ']') { // end of a string
                val sb = StringBuilder()
                while (stack.last() != "[") { // pop until '['
                    // from last to first in the stack, insert at the beginning
                    sb.insert(0, stack.removeAt(stack.lastIndex))
                }
                // pop '['
                stack.removeAt(stack.lastIndex)
                // pop number, how many times to repeat, numbers can be more than 1 digit
                var digits = 1
                var num = 0
                while (stack.isNotEmpty() && stack.last().toIntOrNull() != null) {
                    num += stack.removeAt(stack.lastIndex).toInt() * digits
                    digits *= 10
                }

                // repeat the string and push back to stack
                stack.add(sb.toString().repeat(num))
            } else {
                // add string or number or '[' to stack
                stack.add(s[i].toString())
            }
            i++
        }
        return stack.joinToString("")
    }
}