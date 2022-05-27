package com.chris.leetcode.dp.topic70;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/27
 * @描述 爬楼梯
 */
public class ClimbStairs {
    public static void main(String[] args) {
        int n = 35;
        int res = climbStairs(n);
        System.out.println(res);
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
