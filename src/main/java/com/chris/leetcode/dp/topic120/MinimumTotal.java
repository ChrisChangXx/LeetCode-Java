package com.chris.leetcode.dp.topic120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/28
 * @描述 三角形最小路径和
 */
public class MinimumTotal {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(Collections.singletonList(2)));
        triangle.add(new ArrayList<>(Arrays.asList(3, 4)));
        triangle.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
        triangle.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));
        int res = minimumTotal(triangle);
        System.out.println(res);
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        if (m == 1) {
            return triangle.get(0).get(0);
        }
        if (m == 2) {
            return Math.min(triangle.get(0).get(0) + triangle.get(1).get(0),
                    triangle.get(0).get(0) + triangle.get(1).get(1));
        }

        int res = Integer.MAX_VALUE;
        int[][] dp = new int[m][m];
        dp[0][0] = triangle.get(0).get(0);
        dp[1][0] = triangle.get(0).get(0) + triangle.get(1).get(0);
        dp[1][1] = triangle.get(0).get(0) + triangle.get(1).get(1);
        for (int i = 2; i < m; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                } else if (j == triangle.get(i).size() - 1) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
                }
                if (i == m - 1) {
                    res = Math.min(res, dp[i][j]);
                }
            }
        }
        return res;
    }
}
