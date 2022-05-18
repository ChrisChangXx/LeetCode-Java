package com.chris.leetcode.bfs.topic542;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/18
 * @描述 01矩阵
 */
public class UpdateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] updateMatrix = updateMatrix(matrix);
        for (int i = 0; i < updateMatrix.length; i++) {
            for (int j = 0; j < updateMatrix[0].length; j++) {
                System.out.print(updateMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] updateMatrix(int[][] mat) {
        //首先把所有的0都入队，并且将1的位置设置成-1，表示该位置是未被访问过的
        int m = mat.length, n = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    mat[i][j] = -1;
                }
            }
        }

        int[] dx = new int[]{0, 0, -1, 1};
        int[] dy = new int[]{-1, 1, 0, 0};
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0], y = point[1];
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (newX >= 0 && newY >= 0 && newX < m && newY < n && mat[newX][newY] == -1) {
                    mat[newX][newY] = mat[x][y] + 1;
                    queue.offer(new int[]{newX, newY});
                }
            }
        }
        return mat;
    }
}
