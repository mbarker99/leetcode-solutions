package test.leetcode.problems.p0003_longestsubstringwithoutrepeatingcharacters

import leetcode.problems.p0003_longestsubstringwithoutrepeatingcharacters.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Test {
    private val solution = Solution()

    @Test
    fun `basic example 1`() {
        val s = "abcabcbb"
        val result = solution.lengthOfLongestSubstring(s)
        assertEquals(3, result) // "abc"
    }

    @Test
    fun `basic example 2`() {
        val s = "bbbbb"
        val result = solution.lengthOfLongestSubstring(s)
        assertEquals(1, result) // "b"
    }

    @Test
    fun `basic example 3`() {
        val s = "pwwkew"
        val result = solution.lengthOfLongestSubstring(s)
        assertEquals(3, result) // "wke"
    }

    @Test
    fun `empty string`() {
        val s = ""
        val result = solution.lengthOfLongestSubstring(s)
        assertEquals(0, result)
    }

    @Test
    fun `single character string`() {
        val s = "a"
        val result = solution.lengthOfLongestSubstring(s)
        assertEquals(1, result)
    }

    @Test
    fun `all uniques`() {
        val s = "abcdef"
        val result = solution.lengthOfLongestSubstring(s)
        assertEquals(6, result)
    }

    @Test
    fun `repeating at start`() {
        val s = "abba"
        val result = solution.lengthOfLongestSubstring(s)
        assertEquals(2, result) // "ab" or "ba"
    }

    @Test
    fun `repeating at end`() {
        val s = "dvdf"
        val result = solution.lengthOfLongestSubstring(s)
        assertEquals(3, result) // "vdf"
    }

    @Test
    fun `with spaces`() {
        val s = "a b c a"
        val result = solution.lengthOfLongestSubstring(s)
        assertEquals(3, result) // "a␣b" or "b␣c"
    }

    @Test
    fun `with symbols`() {
        val s = "!@#$%^&*()"
        val result = solution.lengthOfLongestSubstring(s)
        assertEquals(10, result)
    }

    @Test
    fun `unicode characters`() {
        val s = "你好你好"
        val result = solution.lengthOfLongestSubstring(s)
        assertEquals(2, result)
    }
}