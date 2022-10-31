package leetcode.l1031_481_magical_string;

/**
 * 神奇字符串，pass
 *
 * @author yising
 * @since 2022.10.31
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.magicalString(100000));
        for (int i = 1; i < 20; i++) {
            System.out.println(solution.magicalString(i));
        }
    }

    public int magicalString(int n) {
        if (n == 1) {
            return 1;
        }
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 2;
        int index = 1;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (index >= n) {
                break;
            }
            int value = array[index - 1] == 1 ? 2 : 1;
            if (array[i] == 1) {
                array[index++] = value;
                if (value == 1) {
                    count++;
                }
            } else {
                array[index++] = value;
                if (index >= n) {
                    if (value == 1) {
                        count++;
                    }
                    break;
                }
                array[index++] = value;
                if (value == 1) {
                    count += 2;
                }
            }
        }
        return count;
    }
}
