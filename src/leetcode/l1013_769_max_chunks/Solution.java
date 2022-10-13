package leetcode.l1013_769_max_chunks;

/**
 * 最多能完成排序的块
 *
 * @author yising
 * @since 2022-10-13
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxChunksToSorted(new int[] {1,4,0,2,3,5}));    //2
        System.out.println(solution.maxChunksToSorted(new int[] {1,4,0,2,3}));      //1
        System.out.println(solution.maxChunksToSorted(new int[] {4,3,2,1,0}));//1
        System.out.println(solution.maxChunksToSorted(new int[] {1,0,2,3,4}));//4
        System.out.println(solution.maxChunksToSorted(new int[] {0,1}));//2
        System.out.println(solution.maxChunksToSorted(new int[] {1,0}));//1
        System.out.println(solution.maxChunksToSorted(new int[] {1,2,3,4,5,0}));//1
    }
    public int maxChunksToSorted(int[] arr) {
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
            if (max == i) {
                count++;
            }
        }
        return count;
    }
}
