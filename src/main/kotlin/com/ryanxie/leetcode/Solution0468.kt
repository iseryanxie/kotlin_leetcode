package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0468 {
    val zeroTo255 = "([0-9]|[1-9]\\d{1}|1\\d{2}|2[0-4]\\d|25[0-5])"
    val fourHexa = "^[0-9A-Fa-f]+\$"

    val rgv4 = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255
    val v4Reg = Regex(rgv4)

    fun isValidIPv6(ip: String): String {
        ip.split(':').forEach {
            when {
                it.length > 4 -> return "Neither"
                !it.contains(Regex(fourHexa)) -> return "Neither"
            }
        }
        return "IPv6"
    }

    fun validIPAddress(IP: String): String {
        return when {
            v4Reg.matches(IP) -> "IPv4"
            IP.split(':').size == 8 -> isValidIPv6(IP)
            else -> "Neither"
        }
    }
}