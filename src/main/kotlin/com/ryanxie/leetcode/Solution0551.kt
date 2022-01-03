package com.ryanxie.leetcode
/**
 * Write your thoughts here
 *
 */

class Solution0551 {

    fun checkRecord(s: String): Boolean {
//        var totalA = 0
//        var consecutiveL = 0
//        s.forEach {
//            if (it == 'A') {
//                totalA += 1
//                if (totalA >= 2) {
//                    return false
//                }
//            }
//            if (it != 'L') {
//                consecutiveL = 0
//            } else {
//                consecutiveL += 1
//                if (consecutiveL >= 3) {
//                    return false
//                }
//            }
//        }
//        return true
        // functional approach
        return s.count { it == 'A' } < 2 && !s.contains("LLL")
    }
}
