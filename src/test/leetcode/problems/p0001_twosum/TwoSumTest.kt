package leetcode.problems.p0001_twosum

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TwoSumTest {

    private val solution = Solution()

    @Test
    fun `basic test cases`() {
        assertArrayEquals(intArrayOf(0,1), solution.twoSum(intArrayOf(2,7,11,15), 9))
        assertArrayEquals(intArrayOf(1,2), solution.twoSum(intArrayOf(3,2,4), 6))
        assertArrayEquals(intArrayOf(0,1), solution.twoSum(intArrayOf(3,3), 6))
    }

    @Test
    fun `edge cases`() {
        assertArrayEquals(intArrayOf(0,3), solution.twoSum(intArrayOf(0,4,3,0), 0))
        assertArrayEquals(intArrayOf(0,2), solution.twoSum(intArrayOf(-3,4,3,90), 0))
        assertArrayEquals(intArrayOf(0,1), solution.twoSum(intArrayOf(1,2), 3))
    }

    @Test
    fun `large numbers`() {
        assertArrayEquals(intArrayOf(1,2), solution.twoSum(intArrayOf(1000000,500000,500000), 1000000))
        assertArrayEquals(intArrayOf(0,1), solution.twoSum(intArrayOf(-1000000,1000000), 0))
    }

    @Test
    fun `duplicates`() {
        assertArrayEquals(intArrayOf(1,2), solution.twoSum(intArrayOf(1,3,3,4), 6))
        assertArrayEquals(intArrayOf(0,1), solution.twoSum(intArrayOf(3,3,3), 6))
    }

    @Test
    fun `unsorted array`() {
        assertArrayEquals(intArrayOf(1,2), solution.twoSum(intArrayOf(5,75,25), 100))
        assertArrayEquals(intArrayOf(4,5), solution.twoSum(intArrayOf(1,2,3,4,5,6), 11))
    }
}
