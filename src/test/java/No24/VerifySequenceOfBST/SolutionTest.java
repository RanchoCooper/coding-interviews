package No24.VerifySequenceOfBST;

import org.junit.jupiter.api.Test;

/**
 * @author rancho
 * @date 2019/10/1
 */
class SolutionTest {

    @Test
    public void test() {
        int[] array = {4, 8, 6, 12, 16, 14, 10};
        System.out.println("结果：" + Solution.VerifySequenceOfBST(array));
    }

}