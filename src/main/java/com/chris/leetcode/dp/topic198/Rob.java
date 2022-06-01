package com.chris.leetcode.dp.topic198;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/27
 * @描述 打家劫舍
 */
public class Rob {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int res = rob(nums);
        System.out.println(res);
    }

    public static int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[length + 1];
        dp[1] = nums[0];
        dp[2] = Math.max(nums[0], nums[1]);
        for (int i = 3; i <= length; i++) {
            dp[i] = Math.max(nums[i - 1] + dp[i - 2], dp[i - 1]);
        }
        return dp[length];
    }
}
