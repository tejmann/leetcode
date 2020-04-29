class ListNode(var `val`: Int) {
    var next: ListNode? = null
}


fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var curr1 = l1
    var curr2 = l2
    var ans = ListNode(0)
    var carry = 0
    val temp = ans

    while (curr1 != null || curr2 != null) {

        val val1: Int = curr1?.`val` ?: 0
        val val2 = curr2?.`val` ?: 0
        val s = val1 + val2 + carry
        ans.`val` = s % 10
        carry = s / 10

        curr1 = curr1?.next
        curr2 = curr2?.next
        ans.next = when {
            (curr1 == null && curr2 == null && carry == 0) -> null
            (curr1 == null && curr2 == null && carry == 1) -> ListNode(1)
            else -> ListNode(0)
        }
        ans.next?.let {
            ans = it
        }

    }
    return temp
}

