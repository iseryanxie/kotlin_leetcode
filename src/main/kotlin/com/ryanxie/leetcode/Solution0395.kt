package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0395 {
    fun longestSubstring(s: String, k: Int): Int {
        // find number of unique letters in string
        val numUniqueLetters = s.toCharArray().size
        val n = s.length
        var ans = 0
        for (num in 1 until numUniqueLetters + 1) {
            // for all cases of substring contains x unique letters
            val counter: MutableMap<Char, Int> = mutableMapOf()
            var left = 0
            for (right in 0 until n) {
                // for each valid sliding window: there are x unique letters in the sliding window
                counter[s[right]]  = counter[s[right]]?.plus(1) ?: 1
                while (counter.size > num){
                    when (val freq = counter[s[left]]) {
                        null -> {}
                        else -> {
                            if (freq >1) counter[s[left]] = freq - 1
                            else counter.remove(s[left])
                        }
                    }
                    left += 1
                }
                if (counter.all{it.value >= k}) {
                    ans = ans.coerceAtLeast(right - left + 1)
                }
            }
        }
        return ans
    }
}