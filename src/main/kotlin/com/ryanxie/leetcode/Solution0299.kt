package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0299 {
    fun getHint(secret: String, guess: String): String {
        // how many times of each digit appears in secret, unless it's in the same position
        val secretMap = IntArray(10)
        val guessMap = IntArray(10)
        var bulls = 0
        var cows = 0
        for (i in secret.indices) {
            if (secret[i] == guess[i]) {
                bulls++
            } else {
                // store secret and guess mismatches
                secretMap[secret[i] - '0']++
                guessMap[guess[i] - '0']++
            }
        }
        for (i in 0..9) {
            // how many digits matched in secret and guess is the minimum of the two
            // e.g., secretMap[0] = 0, guessMap[0] = 2, cows += 0, guessed 0 two times but secret has none
            // e.g., secretMap[0] = 2, guessMap[0] = 0, cows += 0, secret has 2 0s but guess has none
            cows += secretMap[i].coerceAtMost(guessMap[i])
        }
        return "${bulls}A${cows}B"
    }
}