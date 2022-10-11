package leetcode.l0926_17_19_disappear_num;

public class Solution {
    public static void main(String[] args) {
        int[] result = missingTwo(new int[]{1, 3});
        for(int i: result) {
            System.out.println(i);
        }
    }

    public static int[] missingTwo(int[] nums) {
        int length = nums.length + 2;
        for (int num : nums) {

        }

        return null;
    }

    public static int[] missingTwoFirst(int[] nums) {
        int[] result = new int[2];
        int pos = 0;
        int pre = 0;
        for (int current : nums) {
            if (current - pre == 2) {
                result[pos++] = current - 1;
            } else if (current - pre == 3) {
                result[pos++] = current - 2;
                result[pos++] = current - 1;
                return result;
            }
            pre = current;
        }

        if (pos == 0) {
            result[pos++] = nums.length + 1;
            result[pos++] = nums.length + 2;
        } else if (pos == 1) {
            result[pos++] = nums.length + 2;
        }
        return result;
    }
}
