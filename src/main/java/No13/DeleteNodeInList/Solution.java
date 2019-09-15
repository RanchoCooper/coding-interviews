package No13.DeleteNodeInList;

/**
 * @author rancho
 * @date 2019/9/15
 */
public class Solution {

    class ListNode {
        int value;
        ListNode next;
    }

    public void deleteNode(ListNode head, ListNode target) {

        if (head == null || target == null) {

        } else {
            // 要删除的结点是尾结点
            if (target.next == null) {
                ListNode pointListNode = head;
                while (pointListNode.next.next != null) {
                    pointListNode = pointListNode.next;
                }
                pointListNode.next = null;
            } else {
                ListNode targetNext = target.next;
                target.value = target.next.value;
                target.next = target.next.next;
                targetNext = null;
            }
        }
    }

}
