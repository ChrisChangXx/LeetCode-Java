# [557. Reverse Words in a String III](https://leetcode.cn/problems/reverse-words-in-a-string-iii/)

## 题目描述

给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

**示例 1:**

```
输入: "Let's take LeetCode contest"
输出: "s'teL ekat edoCteeL tsetnoc"
```

**示例 2:**

```
输入: "God Ding"
输出: "doG gniD"
```

**提示:**

- `1 <= s.length <= 5 * 104`
- `s` 包含可打印的 **ASCII** 字符。
- `s`不包含任何开头或结尾空格。
- `s` 里 **至少** 有一个词。
- `s` 中的所有单词都用一个空格隔开。

## 解题思路
- 双指针
- 先将字符串分割成单词，然后反转单词
- 参考反转字符串