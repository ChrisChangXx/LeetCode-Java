# [567. Permutation in String](https://leetcode.cn/problems/permutation-in-string/)

## 题目描述

给你两个字符串 `s1` 和 `s2` ，写一个函数来判断 `s2` 是否包含 `s1` 的排列。如果是，返回 `true` ；否则，返回 `false` 。
换句话说，`s1` 的排列之一是 `s2` 的 **子串** 。

**示例 1:**

```
输入: s1 = "ab", s2 = "eidbaooo"
输出: true
解释: s2 包含 s1 的排列之一 ("ba").
```

**示例 2:**

```
输入: s1 = "ab", s2 = "eidboaoo"
输出: false
```

**提示:**

- `1 <= s1.length, s2.length <= 104`
- `s1` 和 `s2` 仅包含小写字母

## 解题思路

- 滑动窗口
- 构建两个数组，统计每个字符出现的次数
- 判断两个数组是否相等
- 滑动窗口时，s2的数组实时更新，然后判断和s1的数组是否相等