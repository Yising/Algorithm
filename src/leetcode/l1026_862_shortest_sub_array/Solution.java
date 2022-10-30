package leetcode.l1026_862_shortest_sub_array;

/**
 * 和至少为k的最短子数组，fail
 * @author yising
 * @since 2022.10.27
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.shortestSubarray(new int[]{1}, 1));
//        System.out.println(solution.shortestSubarray(new int[]{1,2}, 4));
//        System.out.println(solution.shortestSubarray(new int[]{2,-1,2}, 3));
//        System.out.println(solution.shortestSubarray(new int[]{84,-37,32,40,95}, 167));
        System.out.println(solution.shortestSubarray(new int[]{75,-32,50,32,97}, 129));
    }

    public int shortestSubarray(int[] nums, int k) {
        int[][] array = new int[nums.length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                // TODO
            }
        }
        return 0;
    }
}
