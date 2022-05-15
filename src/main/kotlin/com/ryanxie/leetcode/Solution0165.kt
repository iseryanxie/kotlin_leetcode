package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0165 {
    fun compareVersion(version1: String, version2: String): Int {
        val v1 = version1.split(".")
        val v2 = version2.split(".")
        var i = 0
        var j = 0
        while(i < v1.size && j < v2.size) {
            val n1 = v1[i].toInt()
            val n2 = v2[j].toInt()
            if (n1 > n2) {
                return 1
            } else if (n1 < n2) {
                return -1
            }
            i++
            j++
        }
        // remaining strings in left, if any are greater than 0, return 1
        if (i < v1.size) {
            while(i < v1.size) {
                if (v1[i].toInt() > 0) {
                    return 1
                }
                i++
            }
        }
        if (j < v2.size) {
            while(j < v2.size) {
                if (v2[j].toInt() > 0) {
                    return -1
                }
                j++
            }
        }
        return 0
    }
}