package leetcode.l1029_1773_count_matches;

import java.util.List;

/**
 * 统计匹配索引规则的物品数量，pass
 *
 * @author yising
 * @since 2022.10.30
 */
public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if (ruleKey.equals("color")) {
            index = 1;
        }
        if (ruleKey.equals("name")) {
            index = 2;
        }
        final int idx = index;
        return (int) items.stream().filter(item -> item.get(idx).equals(ruleValue)).count();
    }
}
