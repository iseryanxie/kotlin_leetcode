package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0524 {
    fun findLongestWord(s: String, dictionary: List<String>): String {
        var result = ""
        for (word in dictionary) {
            if (isSubsequence(word, s)) {
                if (word.length > result.length || (word.length == result.length && word < result)) {
                    result = word
                }
            }
        }
        return result

    }
    private fun isSubsequence(word: String, s: String): Boolean {
        var i = 0
        var j = 0
        while (i < word.length && j < s.length) {
            if (word[i] == s[j]) {
                i++
            }
            j++
        }
        return i == word.length
    }
}