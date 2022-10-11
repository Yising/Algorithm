package leetcode.l1010_801_min_swap;

/**
 * 801. 使序列递增的最小交换次数
 *
 * @author yising
 * @since 2022-10-10
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {0,3,5,8,9};
        int[] nums2 = {2,1,4,6,9};
        System.out.println(solution.minSwap(nums1, nums2));
    }

    public int minSwap(int[] nums1, int[] nums2) {
        int unSwap = 0;
        int swap = 1;
        for (int i = 1; i < nums1.length; i++) {
            int minSwap = Integer.MAX_VALUE;
            int minUnSwap = Integer.MAX_VALUE;
            if (nums1[i] > nums1[i - 1] && nums2[i] > nums2[i - 1]) {
                if (unSwap != -1) {
                    minUnSwap = unSwap;
                }
                if (swap != -1) {
                    minSwap = swap + 1;
                }
            }
            if (nums1[i] > nums2[i - 1] && nums2[i] > nums1[i - 1]) {
                if (unSwap != -1) {
                    minSwap = Math.min(unSwap + 1, minSwap);
                }
                if (swap != -1) {
                    minUnSwap = Math.min(swap, minUnSwap);
                }
            }
            if (minUnSwap == Integer.MAX_VALUE && minSwap == Integer.MAX_VALUE) {
                System.out.println("invalid");
                return 0;
            }
            unSwap = minUnSwap;
            swap = minSwap;
            System.out.println("unswap: " + unSwap + ", swap: " + swap);
        }
        return Math.min(unSwap == -1 ? Integer.MAX_VALUE : unSwap, swap == -1 ? Integer.MAX_VALUE : swap);
    }
}
