package No05.PrintListFromTailToHead;

import java.util.ArrayList;

/**
 * @author rancho
 * @date 2019/9/9
 *
 * 使用递归
 */
public class Solution2 {

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
        ArrayList<Integer> result = new ArrayList<>();

        if (listNode != null) {
            result.addAll(printListFromTailToHead(listNode.next));
            result.add(listNode.val);
        }
        return result;
    }

}
