package com.chris.leetcode.backtracking.topic46;

import java.util.*;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/24
 * @描述 全排列
 */
public class Permute {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutes = permute(nums);
        System.out.println(permutes);
    }

    public static List<List<Integer>> permute(int[] nums) {
        int length = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[length];
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, length, 0, path, used, res);
        return res;
    }

    private static void dfs(int[] nums, int length, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (depth == length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < length; i++) {
            if (used[i]) {
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, length, depth + 1, path, used, res);
            used[i] = false;
            path.removeLast();
        }
    }
}
