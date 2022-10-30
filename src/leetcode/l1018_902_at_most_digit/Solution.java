package leetcode.l1018_902_at_most_digit;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 最大为N的数字组合
 *
 * @author yising
 * @since 2022-10-18
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.calculate(3, 4));
    }
    public int atMostNGivenDigitSet(String[] digits, int n) {
        char[] num = String.valueOf(n).toCharArray();
        int smallDigits = calculate(digits.length, num.length);
        if (digits.length < num.length) {
            return smallDigits;
        }
        char[] digitChars = new char[digits.length];
        for (int i = 0; i < digitChars.length; i++) {
            digitChars[i] = digits[i].charAt(0);
        }
        for (int i = 0; i < num.length; i++) {

        }
        return 0;
    }

    private int getCount(char[] digits, char[] num) {
        return 0;
    }

    private int calculate(int n, int length) {
        int result = 0;
        for (int i = 0; i < length; i++) {
            int current = 1;
            for (int j = 0; j <= i; j++) {
                current *= n;
            }
            result += current;
        }
        return result;
    }

    private int getMinerCount(char num, char[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (num < array[i]) {
                count++;
            }
        }
        return count;
    }
}
