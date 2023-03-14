package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0402 {
    fun removeKdigits(num: String, k: Int): String {
        var removeCount = k
        val stack = mutableListOf<Char>()
        for (c in num) {
            // if current item is smaller than the last item in stack, remove the last item in stack
            while (stack.isNotEmpty() && stack.last() > c && removeCount > 0) {
                stack.removeAt(stack.lastIndex)
                removeCount--
            }
            // add current item to stack
            stack.add(c)
        }
        // if there are still more items to remove
        while (stack.isNotEmpty() && removeCount > 0) {
            val item = stack.removeAt(stack.lastIndex)
            // starting from the end,
            if (stack.isNotEmpty() && item < stack.last()) {
                // if last item is smaller than previous item, move the last item to replace the previous item
                stack.removeAt(stack.lastIndex)
                stack.add(item)
            }
            removeCount--
        }
        val value = stack.joinToString("").trimStart('0')
        return value.ifEmpty { "0" }
    }
}