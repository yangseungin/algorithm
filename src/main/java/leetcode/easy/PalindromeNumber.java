package leetcode.easy;

// 난이도 easy
// https://leetcode.com/problems/palindrome-number/description/
// 정수를 문자열로 변환하지 않고 해결해보자는 질문이 있음
// 시간복잡도는 한번 순회하고 O(1)조회를 하기 떄문에 O(n)
// 공간복잡도는 O(1)
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int temp = 0;

        while (x > temp) {
            temp = temp * 10 + x % 10;
            x /= 10;
        }

        return x == temp || x == temp / 10;
    }
}
