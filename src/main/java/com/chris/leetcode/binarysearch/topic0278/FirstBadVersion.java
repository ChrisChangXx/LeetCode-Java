package com.chris.leetcode.binarysearch.topic0278;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/6
 * @描述
 */
public class FirstBadVersion {

    public static void main(String[] args) {
        int n = 2;
        System.out.println(firstBadVersion(n));
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid;
        while (left < right) {// 当left==right时，说明找到了第一个bad version
            mid = left + ((right - left) >> 1);//不能使用(left + right) / 2，因为会溢出
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean isBadVersion(int n) {
        int bad = 1;
        return n >= bad;
    }
}
