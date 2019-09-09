package No10.NumberOf1InBinary;

/**
 * @author rancho
 * @date 2019/9/9
 */
public class Solution {

    public int NumberOf1(int n) {

        int count = 0;
        while (n != 0) {
            n = n & (n -1);
            count++;
        }
        return count;
    }

}
