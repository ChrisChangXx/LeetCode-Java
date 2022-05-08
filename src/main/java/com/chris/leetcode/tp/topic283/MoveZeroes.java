package com.chris.leetcode.tp.topic283;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/8
 * @描述 移动零
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    swap(nums, i, j);
                }
                j++;
            }
        }
    }

    private static void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}
