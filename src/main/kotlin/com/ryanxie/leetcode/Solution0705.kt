package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Design a HashSet without using any built-in hash table libraries.
 */
class Solution0705 {
    class MyHashSet() {
        val SIZE = 128
        val list = MutableList(SIZE) {mutableListOf<Int>()}

        fun add(key: Int) {
            if (!list[key.hashCode()%SIZE].contains(key)){
                list[key.hashCode()%SIZE].add(key)
            }
        }

        fun remove(key: Int) {
            list[key.hashCode()%SIZE].remove(key)
        }

        fun contains(key: Int): Boolean {
            return list[key.hashCode()%SIZE].contains(key)
        }

    }
}