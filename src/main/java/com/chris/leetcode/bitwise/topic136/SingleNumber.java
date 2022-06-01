package com.chris.leetcode.bitwise.topic136;

/**
 * @创建人 zhanghui
 * @创建时间 2022/6/1
 * @描述 只出现一次的数字
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret ^= nums[i];
        }
        return ret;
    }
}
