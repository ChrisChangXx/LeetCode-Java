# [77. 组合](https://leetcode-cn.com/problems/combinations/)

## 题目描述

给定两个整数 `n` 和 `k`，返回 `1 ... n` 中所有可能的 `k` 个数的组合。

你可以按**任意顺序**返回这些组合。

**示例1：**

```
输入: n = 4, k = 2
输出:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
```

**示例2：**

```
输入: n = 1, k = 1
输出: [[1]]
```

**提示：**

- `1 <= n <= 20`
- `1 <= k <= n`

## 解题思路

- 回溯法
- 二叉树
- 剪枝
