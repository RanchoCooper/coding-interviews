package No21.MinInStack;

import java.util.Stack;

/**
 * @author rancho
 * @date 2019/10/1
 */
public class Solution {

    Stack<Integer> stackData = new Stack<>();
    Stack<Integer> stackMin = new Stack<>();


    public void push(int node) {
        stackData.push(node);
        if (stackMin.isEmpty()) {
            stackMin.push(node);
        } else {
            if (stackMin.peek() > node) {
                stackMin.push(node);
            }
        }
    }

    public void pop() {
        if (stackData.pop().equals(stackMin.peek())) {
            stackMin.pop();
        }
    }

    public int top() {
        return stackData.peek();
    }

    public int min() {
        return stackMin.peek();
    }

}
