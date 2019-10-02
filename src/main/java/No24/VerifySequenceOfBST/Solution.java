package No24.VerifySequenceOfBST;

import java.util.Arrays;

/**
 * @author rancho
 * @date 2019/10/1
 */
public class Solution {

    public static boolean VerifySequenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        int rightStart = 0;
        int rootIndex = sequence.length -1;

        for (int i = 0; i < rootIndex; i++) {
            if (sequence[i] < sequence[rootIndex]) {
                rightStart++;
            }
        }

        if (rightStart == 0) {
            VerifySequenceOfBST(Arrays.copyOfRange(sequence, 0, rootIndex));
            return true;
        }

        for (int i = rightStart; i < rootIndex; i++) {
            if (sequence[i] <= sequence[rootIndex]) {
                return false;
            }
        }
        VerifySequenceOfBST(Arrays.copyOfRange(sequence, 0, rightStart));
        VerifySequenceOfBST(Arrays.copyOfRange(sequence, rightStart, rootIndex));
        return true;
    }

}
