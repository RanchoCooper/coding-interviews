package No08.MinNumberInRotatedArray;

/**
 * @author rancho
 * @date 2019/9/9
 *
 * 二分查找
 */
public class Solution {

    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] > array[mid + 1]) {
                return array[mid + 1];
            }
            if (array[mid - 1] > array[mid]) {
                return array[mid];
            }

            if (array[0] < array[mid]) {
                left = mid + 1;
            } else {
                right = mid + 1;
            }
        }
        return -1;

    }

}
