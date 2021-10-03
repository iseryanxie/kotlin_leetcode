package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0028 {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.length ==0) {
            return 0
        }
        for (i in haystack.indices){
            if (haystack[i]==needle[0]){
                if (i+needle.length>haystack.length){
                    return -1
                }
                if (haystack.substring(i,i+needle.length) == needle){
                    return i
                }
            }
        }
        return -1
    }
}