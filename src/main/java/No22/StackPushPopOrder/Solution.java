package No22.StackPushPopOrder;

import java.util.Stack;

/**
 * @author rancho
 * @date 2019/10/1
 */
public class Solution {

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA == null || popA == null) {
            return false;
        }

        int point = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);

            while (!stack.isEmpty() && stack.peek() == popA[point]) {
                stack.pop();
                point++;
            }
        }
        return stack.isEmpty();
    }

}
