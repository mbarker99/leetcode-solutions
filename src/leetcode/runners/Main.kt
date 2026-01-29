package leetcode.runners

import leetcode.problems.`2_addtwonumbers`.Solution
import leetcode.utils.ListNode

fun main() {
    val l1 = ListNode(2).apply {
        next = ListNode(4).apply {
            next = ListNode(3)
        }
    }

    val l2 = ListNode(5).apply {
        next = ListNode(6).apply {
            next = ListNode(4)
        }
    }

    val result = Solution().addTwoNumbers(l1, l2)

    printList(result)
}

fun printList(node: ListNode?) {
    var current = node
    while (current != null) {
        print(current.`val`)
        if (current.next != null) print(" -> ")
        current = current.next
    }
    println()
}
