package No16.ReverseList;


import org.junit.jupiter.api.Test;

/**
 * @author rancho
 * @date 2019/9/15
 */
class SolutionTest {

    @Test
    void reverseList() {
        Solution.ListNode head = new Solution.ListNode(1);
        Solution.ListNode second = new Solution.ListNode(2);
        Solution.ListNode third = new Solution.ListNode(3);
        Solution.ListNode forth = new Solution.ListNode(4);
        head.next = second;
        second.next = third;
        third.next = forth;

        Solution.ListNode listNode = Solution.ReverseList(head);
        System.out.println("解法一：" + listNode);
    }
}