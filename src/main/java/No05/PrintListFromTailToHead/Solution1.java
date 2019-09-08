package No05.PrintListFromTailToHead;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author rancho
 * @date 2019-09-08
 *
 * 使用栈
 */
public class Solution1 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        Stack<ListNode> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            result.add(stack.pop().val);
        }
        return result;
    }

}
