package leetcode.l1008_870_advantage_shuffle;

import java.util.Arrays;


/**
 * NOT OK
 *
 * @author yising
 * @since 2022.10.08
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{2,0,4,1,2};
        int[] nums2 = new int[]{1,3,0,0,2};
        Arrays.stream(solution.advantageCount(nums1, nums2)).forEach(System.out::println);
    }

    public int[] advantageCount(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int minBiggerIndex = i;
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[j] > nums2[i]) {
                    if (nums1[minBiggerIndex] < nums2[i]) {
                        minBiggerIndex = j;
                    } else if (nums1[j] < nums1[minBiggerIndex]) {
                        minBiggerIndex = j;
                    }
                } else if (nums1[j] < nums1[minBiggerIndex] && nums1[minBiggerIndex] < nums2[i]) {
                    minBiggerIndex = j;
                }
            }
            if (minBiggerIndex != i) {
                swap(nums1, i, minBiggerIndex);
            }
        }
        return nums1;
    }

    private void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
