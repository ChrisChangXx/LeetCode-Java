package com.chris.leetcode.bfs.topic994;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/19
 * @描述 腐烂的橘子
 */
public class OrangeRotting {
    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 1}, {0, 1, 2}};
        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        int ans = 0;
        int freshOrangeNum = 0;
        //计算时间的关键，初始有两个烂橘子，它们的时间都为0；被它们两个腐烂掉的橘子时间都为1；以此类推
        Map<int[], Integer> res = new HashMap<>();
        Queue<int[]> queue = new LinkedList<>();
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    int[] tmp = {i, j};
                    queue.offer(tmp);
                    res.put(tmp, 0);
                } else if (grid[i][j] == 1) {
                    freshOrangeNum++;
                }
            }
        }

        int[] dx = new int[]{0, 0, 1, -1};
        int[] dy = new int[]{1, -1, 0, 0};
        while (!queue.isEmpty()) {
            int[] pointer = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = pointer[0] + dx[i], y = pointer[1] + dy[i];
                if (x >= 0 && y >= 0 && x < m && y < n && grid[x][y] == 1) {
                    int[] tmp = {x, y};
                    queue.offer(tmp);
                    grid[x][y] = 2;
                    freshOrangeNum--;
                    res.put(tmp, res.get(pointer) + 1);
                    ans = res.get(tmp);
                }
            }
        }
        if (freshOrangeNum != 0) {
            return -1;
        }
        return ans;
    }
}
