package leetcode.easy;

// 난이도 easy
// https://leetcode.com/problems/longest-common-prefix/

// 제약조건
// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// 시간복잡도는 O(N x M) 문자열 갯수 x 문자열 길이라서 4만 이하
// 공간복잡도는 O(1)

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
