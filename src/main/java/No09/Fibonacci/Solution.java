package No09.Fibonacci;

/**
 * @author rancho
 * @date 2019/9/9
 */
public class Solution {

    public int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }

        int a = 1;
        int b = 1;
        if (n <= 2) {
            return 1;
        }
        while (n-- > 2) {
            b += a;
            a = b - a;
        }
        return b;
    }
}
