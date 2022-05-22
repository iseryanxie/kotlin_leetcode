package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Stack as ArrayDeque
 */
class Solution0187 {
//    fun findRepeatedDnaSequences(s: String): List<String> {
//        val result = mutableListOf<String>()
//        val map = mutableMapOf<String, Int>()
//        val stack = ArrayDeque<Char>()
//        for (i in 0 until s.length) {
//            stack.addLast(s[i])
//            if (i >= 9) {
//                val str = stack.joinToString("")
//                if (map.containsKey(str)) {
//                    if (map[str] == 1) {
//                        result.add(str)
//                    }
//                    map[str] = 2
//                } else {
//                    map[str] = 1
//                }
//                stack.removeFirst()
//            }
//        }
//        return result
//    }
    fun findRepeatedDnaSequences(s: String): List<String> {
        // create list of windowed substrings from s with length 10
        val subStrings = s.windowed(10, 1)
        return subStrings
            .groupBy { it }
            .filter { it.value.size > 1 }
            .map { it.key }
    }
}