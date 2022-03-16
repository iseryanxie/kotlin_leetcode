package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * create a hashmap to store the indice
 * find the least sum of indices
 */
class Solution0599 {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        val map = HashMap<String, Int>()
        for (i in list1.indices) {
            map[list1[i]] = i
        }
        val res = ArrayList<String>()
        var min = Int.MAX_VALUE
        for (i in list2.indices) {
            if (map.containsKey(list2[i])) {
                val sum = i + map[list2[i]]!!
                if (sum < min) {
                    res.clear()
                    res.add(list2[i])
                    min = sum
                } else if (sum == min) {
                    res.add(list2[i])
                }
            }
        }
        return res.toTypedArray()
    }
}