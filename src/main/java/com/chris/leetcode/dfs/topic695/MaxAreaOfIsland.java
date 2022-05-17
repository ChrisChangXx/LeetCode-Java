package com.chris.leetcode.dfs.topic695;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/17
 * @描述 岛屿的最大面积
 */
public class MaxAreaOfIsland {
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        System.out.println(maxAreaOfIsland(grid));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                ans = Math.max(ans, dfs(grid, i, j));
            }
        }
        return ans;
    }

    private static int dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        int ans = 1;
        grid[i][j] = 0;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        for (int i1 = 0; i1 < 4; i1++) {
            int nextX = i + dx[i1];
            int nextY = j + dy[i1];
            ans += dfs(grid, nextX, nextY);
        }
        return ans;
    }
}
