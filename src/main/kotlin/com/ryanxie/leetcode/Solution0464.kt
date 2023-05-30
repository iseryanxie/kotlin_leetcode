package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0464 {
    fun canIWin(maxChoosableInteger: Int, desiredTotal: Int): Boolean {
        val sum = (1 + maxChoosableInteger) * maxChoosableInteger / 2
        // if sum < desiredTotal, no one can win
        if (sum < desiredTotal) return false
        // if desiredTotal <= 0, first player wins
        if (desiredTotal <= 0) return true
        // use a int number to store which numbers has been used, which is the state that determines who will win:
        // the sequence of numbers selected in the state does not affect the final win/lose result
        // 001 -> 1 means the first number was used, 010 -> 2 means the second number was used,
        // 011 -> 3 means the first and second numbers were used

        val map = HashMap<Int, Boolean>()
        return canIWin(maxChoosableInteger, desiredTotal, 0, map)
    }

    // use state: Int to store the number used
    private fun canIWin(maxChoosableInteger: Int, desiredTotal: Int, state: Int, map: HashMap<Int, Boolean>): Boolean {
        if (map.containsKey(state)) return map[state]!!
        for (i in 0 until maxChoosableInteger) {
            val curr = 1 shl i
            if (curr and state == 0) {
                if (desiredTotal <= i + 1 || !canIWin(maxChoosableInteger, desiredTotal - (i + 1), curr or state, map)) {
                    map[state] = true
                    return true
                }
            }
        }
        map[state] = false
        return false
    }

}