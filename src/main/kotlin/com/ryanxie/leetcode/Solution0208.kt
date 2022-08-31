package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0208 {
    class TrieNode() {
        val children: MutableMap<Char, TrieNode> = mutableMapOf<Char, TrieNode>()
        var endOfWord: Boolean = false
    }

    val root = TrieNode()
    fun insert(word: String) {
        var curr = root
        word.forEach { char ->
            if (!curr.children.containsKey(char)) {
                curr.children[char] = TrieNode()
            }
            curr = curr.children[char]!!
        }
        curr.endOfWord = true
    }

    fun search(word: String): Boolean {
        var curr = root
        word.forEach {char->
            curr.children[char]?.let {curr = it} ?: return false
        }
        return curr.endOfWord
    }

    fun startsWith(prefix: String): Boolean {
        var curr = root
        prefix.forEach {char->
            curr.children[char]?.let {curr = it} ?: return false
        }
        return true
    }
}