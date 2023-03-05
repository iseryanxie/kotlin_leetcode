package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * 1. graph and dfs
 * 2. union find
 */
class Solution0399 {
    fun calcEquation(equations: List<List<String>>, values: DoubleArray, queries: List<List<String>>): DoubleArray {
        // use this map to represent the map of a to b and the value of a/b as arc weight
        val map = mutableMapOf<String, MutableMap<String, Double>>()
        // build map
        for (i in equations.indices) {
            val (a, b) = equations[i]
            val v = values[i]
            map.getOrPut(a) { mutableMapOf() }[b] = v
            map.getOrPut(b) { mutableMapOf() }[a] = 1 / v
        }
        return queries.map { query ->
            val (a, b) = query
            if (a !in map || b !in map) -1.0
            else dfs(a, b, map, mutableSetOf())
        }.toDoubleArray()
    }

    private fun dfs(a: String, b: String, map: MutableMap<String, MutableMap<String, Double>>, visited: MutableSet<String>): Double {
        if (a == b) return 1.0
        visited.add(a)
        for ((k, v) in map[a]!!) {
            if (k in visited) continue
            val d = dfs(k, b, map, visited)
            if (d > 0) return d * v
        }
        return -1.0
    }
}