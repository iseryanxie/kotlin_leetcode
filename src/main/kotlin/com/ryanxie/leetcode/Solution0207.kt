package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Use dfs to search each course
 */
class Solution0207 {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        // build graph, prerequisites is to represent the edges
        val preMap = Array(numCourses) { mutableListOf<Int>() }
        val visitedSet = mutableSetOf<Int>()
        prerequisites.forEach {
            // all the prerequisites for a course to build the list
            preMap[it[0]].add(it[1])
        }
        for (i in 0 until numCourses) {
            if (!dfs(i, preMap, visitedSet)) {
                return false
            }
        }
        return true
    }
    fun dfs(cur: Int, preMap: Array<MutableList<Int>>, visitedSet: MutableSet<Int>): Boolean {
        if (visitedSet.contains(cur)) {
            // found loop in the graph, return false
            return false
        }
        if (preMap[cur].isEmpty()) {
            // no prerequisites, can be visited
            return true
        }
        visitedSet.add(cur)
        preMap[cur].forEach {
            // recursively to find if all courses in prerequisites can be visited
            if (!dfs(it, preMap, visitedSet)) {
                return false
            }
        }
        // course can be visited and remove all prerequisites after visited
        visitedSet.remove(cur)
        preMap[cur].clear()
        return true
    }
}