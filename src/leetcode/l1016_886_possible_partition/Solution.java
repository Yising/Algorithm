package leetcode.l1016_886_possible_partition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 可能的二分法
 *
 * @author yising
 * @since 2022-10-16
 */
public class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<Pair> pairList = new ArrayList<>();
        for (int i = 0; i < dislikes.length; i++) {
            Pair pair = new Pair(dislikes[i][0], dislikes[i][1]);
            pairList.add(pair);
        }
        List<List<Integer>> linkList = new ArrayList<>();
        List<Integer> visitedList = new ArrayList<>();
        for (int i = 0; i < pairList.size(); i++) {
            if (isVisited(visitedList, i)) {
                continue;
            }
        }
        return false;
    }

    private boolean isVisited(List<Integer> list, int i) {
        return list.stream().anyMatch(val -> val == i);
    }

    private class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public boolean contains(int value) {
            return value == first || value == second;
        }
    }
}
