package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0406 {
    fun reconstructQueue(people: Array<IntArray>): Array<IntArray> {
        // sort by height descending, then by number count ascending
        // because same height people, we want the number count should always be ascending
        // e.g., [7,0], then [7,1], then [7,2], etc.
        people.sortWith(Comparator { o1, o2 ->
            if (o1[0] == o2[0]) {
                o1[1] - o2[1]
            } else {
                o2[0] - o1[0]
            }
        })
        val result = mutableListOf<IntArray>()
        for (person in people) {
            // every time you add a person, add them to the index of their number count
            // because all the people already in result are taller than the current person
            result.add(person[1], person)
        }
        return result.toTypedArray()
    }
}