package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0179 {
    fun largestNumber(nums: IntArray): String {
        val sb = StringBuilder()
        // sort in descending order
        val nums = nums.map{it.toString()}.sortedWith(Comparator<String> { o1, o2 ->
            val s1 = o1 + o2
            val s2 = o2 + o1
            s2.compareTo(s1)
        })
        nums.forEach {
            sb.append(it)
        }
        // if the first digit is 0 (it can be 00000), return 0
        return if (sb.toString().startsWith("0")) "0" else sb.toString()
    }
}