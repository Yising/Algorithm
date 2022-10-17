package leetcode.l1017_904_total_fruits;

import java.util.HashMap;
import java.util.Map;

/**
 * 水果成篮
 *
 * @author yising
 * @since 2022-10-17
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.totalFruit(new int[] {1,2,1}));
        System.out.println(solution.totalFruit(new int[] {0,1,2,2}));
        System.out.println(solution.totalFruit(new int[]{1, 2, 3, 2, 2}));
        System.out.println(solution.totalFruit(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}));
    }

    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        Basket basket = new Basket(fruits.length);
        int max = 0;
        while(right < fruits.length) {
            if (basket.fruits > 2) {
                basket.remove(fruits[left]);
                left++;
            } else {
                basket.add(fruits[right]);
                if (basket.fruits <= 2) {
                    max = max > basket.count ? max : basket.count;
                }
                right++;
            }
        }
        return max;
    }

    private static class Basket {
        private int[] array;

        private int fruits = 0;

        private int count = 0;

        protected Basket(int size) {
            array = new int[size + 1];
        }

        public void add(int index) {
            if (array[index] == 0) {
                fruits++;
            }
            array[index] = array[index] + 1;
            count++;
        }

        public void remove(int index) {
            array[index] = array[index] - 1;
            if (array[index] == 0) {
                fruits--;
            }
            count--;
        }
    }
}
