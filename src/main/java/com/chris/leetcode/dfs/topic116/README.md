# [116. 填充每个节点的下一个右侧节点指针](https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/)

## 题目描述

给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：

```
struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
```

填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
初始状态下，所有 next 指针都被设置为 NULL。

**示例1：**
![来源https://assets.leetcode.com/uploads/2019/02/14/116_sample.png](116_sample.png)

```
输入：root = [1,2,3,4,5,6,7]
输出：[1,#,2,3,#,4,5,6,7,#]
```

**示例2：**

```
输入：root = []
输出：[]
```

**提示：**

- 树中节点的数量在 `[0, 212 - 1]` 范围内
- `-1000 <= node.val <= 1000`

## 解题思路

![来源https://pic.leetcode-cn.com/1c7010a175e04043f7e88fbccd69ed15fa42b474eb2b5eac6c32ad833e0ec91c-7.gif](animation.gif)

- 深度优先搜索
- 先连接每一层的左右子树
- 再递归每一层的左右结点