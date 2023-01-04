package com.ryanxie.leetcode


/**
 * Write your thoughts here
 * (a*b)%c = (a%c * b%c)%c
 * (a+b)%c = (a%c + b%c)%c
 * (a-b)%c = (a%c - b%c)%c
 * (a/b)%c = (a%c * b^-1%c)%c
 * (a^b)%c = (a%c)^b%c
 * b = [3,2] -> a^30*a^2 -> (a^3)^10 * a^2 -> ((a^3)^10%c * a^2%c) %c -> let d = a^3 -> (d^10 %c * a^2%c) %c
 */
class Solution0372 {
    private val MOD = 1337
    fun superPow(a: Int, b: IntArray): Int {
        var res = 1
        for (i in b.indices) {
            res = powerMod(res, 10) * powerMod(a, b[i]) % MOD // % MOD, additional %mod is not necessary
        }
        return res
    }

    // define a recursive function to calculate power and mod by 1337 that avoids overflow
    private fun powerMod(x: Int, n: Int): Int {
        if (n == 0) return 1
        if (n == 1) return x % MOD
        return powerMod(x % MOD, n / 2) * powerMod(x % MOD, n - n / 2) % MOD
    }

}