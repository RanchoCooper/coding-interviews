package No04.ReplaceBlank;

/**
 * @author rancho
 * @date 2019-09-08
 */
public class Solution {

    public static void main(String[] args) {
        replaceSpace(new StringBuffer("hello world"));
    }

    public static String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }

        int oldLength = str.length();
        for (int i = 0; i < oldLength; i++) {
            if (str.charAt(i) == ' ') {
                // 需要多拓展2个字符
                str.append("  ");
            }
        }

        int newLength = str.length();
        int p1 = oldLength - 1;
        int p2 = newLength - 1;
        while (p1 != p2) {
            if (str.charAt(p1) == ' ') {
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
                p1--;
            } else {
                str.setCharAt(p2--, str.charAt(p1--));
            }
        }
        return str.toString();
    }

}
