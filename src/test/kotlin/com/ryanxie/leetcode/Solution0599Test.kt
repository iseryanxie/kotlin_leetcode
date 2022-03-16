package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Assert.assertArrayEquals
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder

class Solution0599Test {
    private val solution = Solution0599()

    @Test
    fun test1() {
        val list1 = arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC")
        val list2 = arrayOf("Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun")
        expectThat(solution.findRestaurant(list1, list2).toList()).containsExactlyInAnyOrder("Shogun")
    }
}