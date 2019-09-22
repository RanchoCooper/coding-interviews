package No18.SubstrctureInTree;

import org.junit.jupiter.api.Test;


/**
 * @author rancho
 * @date 2019/9/22
 */
class SolutionTest {
    @Test
    public void test18() throws Exception {
        Solution.TreeNode root1 = new Solution.TreeNode(3);
        Solution.TreeNode node1 = new Solution.TreeNode(4);
        Solution.TreeNode node2 = new Solution.TreeNode(5);
        Solution.TreeNode node3 = new Solution.TreeNode(1);
        Solution.TreeNode node4 = new Solution.TreeNode(2);
        Solution.TreeNode node5 = new Solution.TreeNode(0);
        Solution.TreeNode node6 = new Solution.TreeNode(0);
        root1.left = node1;
        root1.right = node2;
        node1.left = node3;
        node1.right = node4;
        node4.left = node5;
        node4.right = node6;

        Solution.TreeNode root2 = new Solution.TreeNode(4);
        Solution.TreeNode a = new Solution.TreeNode(1);
        Solution.TreeNode b = new Solution.TreeNode(2);
        root2.left = a;
        root2.right = b;

        System.out.println("是否包含 " + Solution.hasSubTree(root1, root2));

    }
}