package com.chris.leetcode.bitwise.topic231;

/**
 * solution231
 * 2的幂
 * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * @author zhangh
 * @date 2021/05/31
 */
public class IsPowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2));
    }
}
