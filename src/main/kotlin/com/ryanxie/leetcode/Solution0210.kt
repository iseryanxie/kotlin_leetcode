package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0210 {
    fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
        // build graph, prerequisites is to represent the edges
        val preMap = Array(numCourses) { mutableListOf<Int>() }
        val visitedSet = mutableSetOf<Int>()
        val cycle = mutableSetOf<Int>()
        prerequisites.forEach {
            // all the prerequisites for a course to build the list
            preMap[it[0]].add(it[1])
        }
        // find the topological order
        val order = mutableListOf<Int>()
        for (i in 0 until numCourses) {
            if (!dfs(i, preMap, visitedSet, cycle, order)) {
                return intArrayOf()
            }
        }
        return order.toIntArray()
    }
    fun dfs(i: Int, preMap: Array<MutableList<Int>>, visitedSet: MutableSet<Int>, cycle: MutableSet<Int>, order: MutableList<Int>): Boolean {
        if (cycle.contains(i)) {
            return false
        }
        if (visitedSet.contains(i)) {
            return true
        }
        cycle.add(i)
        preMap[i].forEach {
            if (!dfs(it, preMap, visitedSet, cycle, order)) {
                return false
            }
        }
        cycle.remove(i)
        visitedSet.add(i)
        order.add(i)
        return true
    }
}