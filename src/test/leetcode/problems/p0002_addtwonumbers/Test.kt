package test.leetcode.problems.p0002_addtwonumbers

import leetcode.problems.p0002_addtwonumbers.Solution
import leetcode.utils.listOfDigits
import leetcode.utils.toList
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Test {
    private val solution = Solution()

    @Test
    fun `basic test`() {
        val l1 = listOfDigits(2, 4, 3)
        val l2 = listOfDigits(5, 6, 4)
        val result = solution.addTwoNumbers(l1, l2)
        assertEquals(listOf(7, 0, 8), toList(result))
    }

    @Test
    fun `different size lists`() {
        val l1 = listOfDigits(2, 4, 3)
        val l2 = listOfDigits(5, 6, 4, 5, 5, 6)
        val result = solution.addTwoNumbers(l1, l2)
        assertEquals(listOf(7, 0, 8, 5, 5, 6), toList(result))
    }

    @Test
    fun `one list is null`() {
        val l1 = listOfDigits()
        val l2 = listOfDigits(1, 2)
        val result = solution.addTwoNumbers(l1, l2)
        assertEquals(listOf(1, 2), toList(result))
    }

    @Test
    fun `extra carry of 1 at the end`() {
        val l1 = listOfDigits(9, 9)
        val l2 = listOfDigits(1)
        val result = solution.addTwoNumbers(l1, l2)
        assertEquals(listOf(0,0,1), toList(result))
    }

    @Test
    fun `single digit carry`() {
        val l1 = listOfDigits(9)
        val l2 = listOfDigits(9)
        val result = solution.addTwoNumbers(l1, l2)
        assertEquals(listOf(8, 1), toList(result))
    }

    @Test
    fun `both zero`() {
        val l1 = listOfDigits(0)
        val l2 = listOfDigits(0)
        val result = solution.addTwoNumbers(l1, l2)
        assertEquals(listOf(0), toList(result))
    }
}