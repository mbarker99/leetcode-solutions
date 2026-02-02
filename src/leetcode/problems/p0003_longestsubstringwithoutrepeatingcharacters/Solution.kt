package leetcode.problems.p0003_longestsubstringwithoutrepeatingcharacters


/**
 * Explanation:
 *
 * This is a 'sliding window' problem. We will have two pointers starting at the beginning, then increase the size of that window until we hit a repeat character.
 * We will keep track of the max size of the window.
 *
 * Example:
 *
 * Input: aabcc
 * Output: 3
 * TODO: time and space complexity
 */
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var start = 0
        var end = 0
        var max = 0

        // This will hold a max number of chars equal to the number of unique chars in the string.
        val uniques = mutableSetOf<Char>()

        while (end < s.length) {
            // If the map doesn't already contain the character, add it, and
            if (!uniques.contains(s[end])) {
                uniques.add(s[end])
                end++
                max = maxOf(uniques.size, max)
            } else {
                uniques.remove(s[start])
                start++
            }
        }

        return max
    }
}