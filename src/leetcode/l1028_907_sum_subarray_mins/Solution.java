package leetcode.l1028_907_sum_subarray_mins;

/**
 * 子数组的最小值之和
 *
 * @author yising
 * @since 2022.10.28
 *
 */
public class Solution {
    private static final long MOD = 10*10*10*10*10*10*10*10*10+7;

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sumSubarrayMins(new int[] {3}));
        System.out.println(solution.sumSubarrayMins(new int[] {3,1,2,4}));
        System.out.println(solution.sumSubarrayMins(new int[] {11,81,94,43,3}));
    }

    // TODO 时间复杂度没过
    public int sumSubarrayMins(int[] arr) {
        long sum = 0;
        int[] minValue = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            minValue[i] = arr[i];
            sum = sum + arr[i];
        }
        sum = sum % MOD;
        for (int length = 2; length <= arr.length; length++) {
            for (int index = 0; index < arr.length - length + 1; index++) {
                int subMin = minValue[index];
                int min = Math.min(subMin, arr[index + length - 1]);
                minValue[index] = min;
                sum = sum + min;
            }
            sum = sum % MOD;
        }
        return (int) sum;
    }

    private long getMinSum(int[] arr, int length) {
        long sum = 0;
        for (int i = 0; i <= arr.length - length; i++) {
            int min = arr[i];
            for (int j = i; j < i + length; j++) {
                min = Math.min(min, arr[j]);
            }
            sum = (sum + min) % MOD;
        }
        return sum;
    }

    private class Pair {
        int index;
        int length;

        public Pair(int index, int length) {
            this.index = index;
            this.length = length;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Pair) {
                Pair that = (Pair) obj;
                return that.index == index && that.length == length;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return index + length;
        }
    }
}
