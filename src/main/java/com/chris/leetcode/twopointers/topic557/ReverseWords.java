package com.chris.leetcode.twopointers.topic557;

import com.chris.leetcode.twopointers.topic344.ReverseString;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/9
 * @描述 反转字符串中的单词 III
 */
public class ReverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            char[] chars = word.toCharArray();
            ReverseString.reverseString(chars);
            res.append(chars).append(" ");
        }
        return res.substring(0, res.length() - 1);
    }
}
