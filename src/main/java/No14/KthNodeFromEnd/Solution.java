package No14.KthNodeFromEnd;

/**
 * @author rancho
 * @date 2019/9/15
 */
public class Solution {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k < 1) {
            return null;
        }

        ListNode ahead = head;
        ListNode behind = head;
        for (int i = 0; i < k - 1; i++) {
            if (ahead.next == null) {
                return null;
            }
            ahead = ahead.next;
        }

        while (ahead.next != null) {
            ahead = ahead.next;
            behind = behind.next;
        }
        return behind;


    }

}
