package com.chris.leetcode.tp.topic344;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/9
 * @描述 反转字符串
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        for (char c : s) {
            System.out.print(c + " ");
        }
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            swap(s, left, right);
            left++;
            right--;
        }
    }

    private static void swap(char[] s, int left, int right) {
        char tmp = s[left];
        s[left] = s[right];
        s[right] = tmp;
    }
}
