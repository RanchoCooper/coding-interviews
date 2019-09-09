package No07.QueueWithTwoStacks;

import java.util.Stack;

/**
 * @author rancho
 * @date 2019/9/9
 */
public class DoubleStackQueue {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.add(node);
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return 0;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}
