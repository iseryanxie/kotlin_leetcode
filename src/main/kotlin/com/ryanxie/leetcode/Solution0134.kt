package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * make one loop in the array, if at any point between start and current when tank is <0,
 * then the starting point must be
 * after this point (set start to i+1), and we can reset the tank to 0
 * 1) rule out the impossible starting points; 2) if solution exist (total gas> total cost), then
 * the first point that is possible must be the starting point, because we know solution is unique: if between A and B,
 * gas is always >= cost, and A is an earlier point, then B cannot be the starting point.
 */
class Solution0134 {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        var start = 0
        var total = 0
        var tank = 0
        for (i in gas.indices) {
            tank += gas[i] - cost[i]
            if (tank < 0) {
                start = i + 1
                tank = 0
            }
            total += gas[i] - cost[i]
        }
        return if (total >= 0) start else -1
    }
}