package No16.ReverseList;

/**
 * @author rancho
 * @date 2019/9/15
 */
public class Solution {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode ReverseList(ListNode head) {
        ListNode reversedHead = null;
        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            if (next == null) {
                reversedHead = current;
            }
            current.next = pre;

            pre = current;
            current = next;
        }

        return reversedHead;

    }

}
