package com.chris.leetcode.dfs.topic733;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/12
 * @描述 图像渲染
 */
public class FloodFill {
    public static void main(String[] args) {
        int[][] image = new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] result = floodFill(image, sr, sc, newColor);
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (newColor == oldColor) {
            return image;
        }
        dfs(image, sr, sc, oldColor, newColor);
        return image;
    }

    private static void dfs(int[][] image, int x, int y, int oldColor, int newColor) {
        System.out.println("(" + x + "," + y + ")");
        if (x >= 0 && x < image.length && y >= 0 && y < image[0].length && image[x][y] == oldColor) {
            image[x][y] = newColor;
            dfs(image, x - 1, y, oldColor, newColor);
            dfs(image, x + 1, y, oldColor, newColor);
            dfs(image, x, y + 1, oldColor, newColor);
            dfs(image, x, y - 1, oldColor, newColor);
        }
    }
}
