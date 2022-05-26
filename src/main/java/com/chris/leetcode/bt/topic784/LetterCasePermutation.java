package com.chris.leetcode.bt.topic784;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/26
 * @描述 字母大小写全排列
 */
public class LetterCasePermutation {
    public static void main(String[] args) {
        String str = "a1b2";
        List<String> res = letterCasePermutation(str);
        System.out.println(res);
        System.out.println((char) ('a' - 32));
        System.out.println((int) 'A');
        System.out.println((int) 'z');
        System.out.println((int) 'Z');
        System.out.println('A' ^ (1 << 5));
    }

    public static List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        char[] chars = s.toCharArray();
        int length = chars.length;
        dfs(res, chars, 0, length);
        return res;
    }

    private static void dfs(List<String> res, char[] chars, int index, int length) {
        if (length == index) {
            res.add(new String(chars));
            return;
        }

        dfs(res, chars, index + 1, length);
        if (Character.isLetter(chars[index])) {
            if (Character.isUpperCase(chars[index])) {
                chars[index] += 32;
            } else {
                chars[index] -= 32;
            }
            dfs(res, chars, index + 1, length);
        }
    }
}
