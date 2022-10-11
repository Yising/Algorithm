package leetcode.l0925_788_good_number;

import java.util.ArrayList;

public class Solution {
    private static final boolean[] IS_GOOD_NUMBER = {false, false, true, false,false, true, true, false, false, true};

    private static final int[] REVERSE_NUM = {0, 1, 5, 3, 4, 2, 9, 7, 8, 6};

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rotatedDigits(10000));
    }

    public int rotatedDigits(int n) {
        int goodNum = 0;
        for (int i = 0; i <= n; i++) {
            if (isGoodNum(i)) {
                System.out.println(i);
                goodNum++;
            }
        }
        return goodNum;
    }

    private boolean isGoodNum(int num) {
        if (num < 10) {
            return IS_GOOD_NUMBER[num];
        }
        char[] numChar = new String(num + "").toCharArray();
        int[] reverseArray = new int[numChar.length];
        for (int i = 0; i < numChar.length; i++) {
            int value = numChar[i] - '0';
            if (value == 3 || value == 4 || value == 7) {
                return false;
            }
            if (value == 0 || value == 1 || value == 8) {
                reverseArray[i] = value;
            } else {
                reverseArray[i] = REVERSE_NUM[value];
            }
        }
        int reverseNum = 0;
        for (int j : reverseArray) {
            reverseNum = reverseNum * 10 + j;
        }
        return num != reverseNum;
    }
}
