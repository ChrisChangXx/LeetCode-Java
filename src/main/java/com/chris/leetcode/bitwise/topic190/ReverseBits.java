package com.chris.leetcode.bitwise.topic190;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/30
 * @描述 颠倒二进制位
 */
public class ReverseBits {
    public static void main(String[] args) {
        int n = 43261596;
        System.out.println(reverseBits(n));
    }

    public static int reverseBits(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            ret = ret << 1;
            ret = ret | (n & 1);//n&1的结果表示n的最低位是否为1；如果为1则ret的最低位为1，否则为0
            n = n >> 1;
        }
        return ret;
    }
}
