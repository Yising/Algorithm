package leetcode.l1027_1822_array_sign;

/**
 * 数组元素积的符号
 *
 * @author yising
 * @since 2022.10.27
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.arraySign(new int[] {-1,-2,-3,-4,3,2,1}));
        System.out.println(solution.arraySign(new int[] {1,5,0,2,-3}));
        System.out.println(solution.arraySign(new int[] {-1,1,-1,1,-1}));
    }
    public int arraySign(int[] nums) {
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                product *= -1;
            }
        }
        return product;
    }
}
