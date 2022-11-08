package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Use stack to store the characters
 */
class Solution0316 {
    fun removeDuplicateLetters(s: String): String {
        val stack = mutableListOf<Char>()
        val seen = mutableSetOf<Char>()
        val lastOccurrence = IntArray(26)
        for (i in s.indices) {
            // last time the character in the string appears at index i
            lastOccurrence[s[i] - 'a'] = i
        }
        for (i in s.indices) {
            val c = s[i]
            // if the character is already in the stack, we can remove the duplicate, because abc must be smaller than bca
            // skip it
            if (c in seen) continue
            while (stack.isNotEmpty() && stack.last() > c && lastOccurrence[stack.last() - 'a'] > i) {
                // remove the last character in the stack when
                // 1) the new character is smaller than the last character in the stack
                // 2) the last character in the stack appears later in the string
                seen.remove(stack.removeAt(stack.lastIndex))
            }
            stack.add(c)
            seen.add(c)
        }
        return stack.joinToString("")
    }
}