package leetcode.problems.`1_twosum`

/**
 * Synopsis:
 *
 * This is a one pass table solution using a map.
 * TODO: Explore why a HashMap is superior to a Map
 *
 * Explanation:
 *
 * The idea is to create a map, mapping each num to its index.
 * First, we create the complement of each num, i.e. what num do we need to reach the target.
 * Then we check if the complement already exists in the created map,
 * if there are no matches, we add to the map, and move to the next num.
 * Repeat until we find a match or we reach the end of the array
 *
 * Example
 *
 * Input: nums = [2,7,11,15], target = 9
 * - Complement of 2 is 7, that does not exist in the map so we add [2,0] to the map.
 * - Complement of 7 is 2, that DOES exist, so we return the map values of 2 and the current index `i`
 *      as an array, which is [0,1]. <- The correct answer
 *
 *
 * Time complexity: O(n)
 *  - We will only ever traverse the list once. So the time complexity is the same as the size of the list in the worst case.
 *  - Each lookup will only cost O(1) time.
 *
 *  Space Complexity: O(n)
 *  - We are onlu creating the map as extra space, which again can only be as large as `nums`
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // Create a mutable map
        val map = mutableMapOf<Int, Int>()
        // iterate
        for (i in nums.indices) {
            // Calculate complement
            val complement = target - nums[i]
            // check if complement exists
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            // if complement does not exist, add the current num to the map
            map[nums[i]] = i
        }
        // If no solution is found, return empty array
        return intArrayOf()
    }
}