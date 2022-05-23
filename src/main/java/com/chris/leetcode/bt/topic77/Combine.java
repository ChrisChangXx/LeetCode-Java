package com.chris.leetcode.bt.topic77;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/19
 * @描述 组合
 */
public class Combine {
    public static void main(String[] args) {
        Combine combine = new Combine();
        List<List<Integer>> list = combine.combine(5, 3);
        for (List<Integer> integers : list) {
            System.out.println(integers);
        }
    }

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> tmp = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtracking(1, n, k);
        return res;
    }

    private void backtracking(int start, int n, int k) {
        //剪枝
        if (tmp.size() + (n - start + 1) < k) {
            return;
        }

        if (tmp.size() == k) {
            res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = start; i <= n; i++) {
            tmp.add(i);
            backtracking(i + 1, n, k);
            tmp.remove(tmp.size() - 1);
        }
    }
}
