package leetcode.problems.p0002_addtwonumbers

import leetcode.utils.ListNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 *
 * Explanation:
 *
 * ListNodes are numbers with their digits in reverse order, so l1 = [8,0,1] is 108, and l2 = [4,3,5] is 534
 * The reverse order helps us because that just means we start with the least significant digit.
 * From there we are just making a simple adder.
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        // Create temp list node to store our sum.
        val tempHead = ListNode(0)
        // Create a pointer to the current digit.
        var current = tempHead

        // Create references to our inputs.
        var p1 = l1
        var p2 = l2
        // Keep track of our carry digit.
        var carry = 0

        // Iterate over the inputs, adding up their digits as we go. Stop when the lists are empty, and there is no more carry.
        while (p1 != null || p2 != null || carry != 0) {
            // Sum the current digits.
            val x = p1?.`val` ?: 0
            val y = p2?.`val` ?: 0
            val sum = x + y + carry

            // Determine the carry.
            carry = sum / 10 // if sum is 14 in this case, this will return 1.

            // Set the next pointer of the current node to the sum digit, without including the carry, using modulus.
            current.next = ListNode(sum % 10) // if sum is 14 in this case, this will be 4

            // Move the current pointers forwards.
            current = current.next!!
            p1 = p1?.next
            p2 = p2?.next
        }
        // The while loop above will return the sum, but with a 0 in the head position, so return the next.
        return tempHead.next
    }
}