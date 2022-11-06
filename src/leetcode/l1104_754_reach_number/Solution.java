package leetcode.l1104_754_reach_number;

import java.util.HashSet;

/**
 * 到达终点数字, fail
 *
 * @author yising
 * @since 2022.11.6
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reachNumber(2));
        System.out.println(solution.reachNumber(3));
        System.out.println(solution.reachNumber(100));
        System.out.println(solution.reachNumber(65536));
        System.out.println(solution.reachNumber(-1000000000));
    }
    public int reachNumber(int target) {
        HashSet<Integer> steps = new HashSet<>();
        steps.add(0);
        int length = 1;
        while (true) {
            Result result = getReachNum(steps, length, target);
            if (result.length != 0) {
                return result.length;
            }
            steps = result.set;
            length++;
        }
    }

    private Result getReachNum(HashSet<Integer> set, int length, int target) {
        HashSet<Integer> nextSteps = new HashSet<>();
        for (int number : set) {
            int nextLeft = number + length;
            int nextRight = number - length;
            if (nextRight == target || nextLeft == target) {
                return new Result(length, null);
            }
            nextSteps.add(nextLeft) ;
            nextSteps.add(nextRight);
        }
        return new Result(0, nextSteps);
    }

    private static class Result {
        int length;
        HashSet<Integer> set;

        public Result(int length, HashSet<Integer> set) {
            this.length = length;
            this.set = set;
        }
    }
}


