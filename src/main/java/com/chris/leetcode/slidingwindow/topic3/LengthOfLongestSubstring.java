package com.chris.leetcode.slidingwindow.topic3;

import java.util.HashSet;
import java.util.Set;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/11
 * @描述 无重复字符的最长子串
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, res = 0;
        Set<Character> characters = new HashSet<>();
        while (right < s.length()) {
            if (characters.contains(s.charAt(right))) {
                while (characters.contains(s.charAt(right))) {
                    characters.remove(s.charAt(left));
                    left++;
                }
            }
            characters.add(s.charAt(right));
            res = Math.max(right - left + 1, res);
            right++;
        }
        return res;
    }
}
