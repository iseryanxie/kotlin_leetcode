package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * For each digit, permutation of 10 choose n - permutation of 9 choose (n-1)
 * for example, XX -> first digit can be 1-9, second digit can be 0-9
 * -> 2 digits with any of 10 numbers - first digit 0, second digit can be 1-9
 */
class Solution0357 {
    fun countNumbersWithUniqueDigits(n: Int): Int {
        // + 1 because 0 is a valid number for single digit number
        return (1..n).map { numPermutations(10, it) - numPermutations(9, it - 1) }.sum() + 1
    }
    // helper function to calculate number of permutation
    fun numPermutations(n: Int, k: Int): Int {
        return (0 until k).fold(1) { acc, i -> acc * (n - i) }
    }
}