package leetcode.easy;

import java.util.Map;
// 난이도 easy
// https://leetcode.com/problems/roman-to-integer/description/

// 제약조건
// 1 <= s.length <= 15
// s문자만 포함합니다 ('I', 'V', 'X', 'L', 'C', 'D', 'M').
// 해당 숫자는 범위 내에 있는 유효한 로마 숫자  임이 보장 됩니다 .s[1, 3999]

// 시간복잡도는 O(n)
// 공간복잡도는 O(1)
public class RomantoInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            if (i + 1 < s.length() && curr < map.get(s.charAt(i + 1))) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }

        return sum;
    }
}
