package No17.MergeSortedLists;

import org.junit.jupiter.api.Test;


/**
 * @author rancho
 * @date 2019/9/17
 */
class SolutionTest {

    @Test
    void merge2() {
        Solution.ListNode list1 = new Solution.ListNode(1);
        list1.next = new Solution.ListNode(3);
        list1.next.next = new Solution.ListNode(5);

        Solution.ListNode list2 = new Solution.ListNode(2);
        list2.next = new Solution.ListNode(4);
        list2.next.next = new Solution.ListNode(6);

        Solution.Merge2(list1, list2);
    }
}