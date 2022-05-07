# [977. Squares of a Sorted Array](https://leetcode-cn.com/problems/squares-of-a-sorted-array/)

## 题目描述
给你一个按 **非递减顺序** 排序的整数数组 `nums`，返回 **每个数字的平方** 组成的新数组，要求也按 **非递减顺序** 排序。

**示例 1:**
```
输入: [-4, -1, 0, 3, 10]
输出: [0, 1, 9, 16, 100]
解释: 平方后，数组变为 [16, 1, 0, 9, 100]
排序后，数组变为 [0, 1, 9, 16, 100]
```

**示例 2:**
```
输入: [-7, -3, 2, 3, 11]
输出: [4, 9, 9, 49, 121]
```

**提示:**
- `1 <= nums.length <= 10^4`
- `-10^4 <= nums[i] <= 10^4`
- `nums` 已按**非递减顺序**排序。
- 请你设计一个时间复杂度为 `O(n)` 的算法来解决这个问题。

## 解题思路
- 双指针
- 左指针指向最小的数，右指针指向最大的数
- 左指针大于右指针结束循环
- 注意时间复杂度