package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 난이도 easy
// https://leetcode.com/problems/two-sum/description/
// 시간복잡도가 n^2보다 낮은 알고리즘을 사용하도록 해보자는 질문이 있음
// 시간복잡도는 한번 순회하고 O(1)조회를 하기 떄문에 O(n)
// 공간복잡도는 O(n)
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key)) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};

    }
}
