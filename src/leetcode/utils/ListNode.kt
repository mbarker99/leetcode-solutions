package leetcode.utils

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun listOfDigits(vararg digits: Int): ListNode? {
    val dummy = ListNode(0)
    var curr = dummy
    for (d in digits) {
        curr.next = ListNode(d)
        curr = curr.next!!
    }
    return dummy.next
}

fun toList(node: ListNode?): List<Int> {
    val result = mutableListOf<Int>()
    var curr = node
    while (curr != null) {
        result.add(curr.`val`)
        curr = curr.next
    }
    return result
}
