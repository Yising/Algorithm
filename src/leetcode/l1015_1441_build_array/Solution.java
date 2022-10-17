package leetcode.l1015_1441_build_array;

import java.util.ArrayList;
import java.util.List;


/**
 * 用栈操作数组
 *
 * @author yising
 * @since 2022-10-15
 */
public class Solution {
    private static final String PUSH = "Push";

    private static final String POP = "Pop";

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[] {1,2};
        int n = 4;

        System.out.println(solution.buildArray(array, n).stream().reduce((val, cur) -> val + "\t" + cur));
    }

    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i == target[index]) {
                result.add(PUSH);
                index++;
            } else {
                result.add(PUSH);
                result.add(POP);
            }
            if (index >= target.length) {
                break;
            }
        }
        return result;
    }
}
