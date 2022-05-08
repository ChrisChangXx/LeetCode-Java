package com.chris.leetcode.tp.topic167;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/8
 * @描述 两数之和 II
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 7, 9};
        int target = 7;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + "," + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return null;
    }

    //超时写法，暴力法
    public static int[] twoSumViolence(int[] nums, int target) {
        int[] result = new int[2];
        boolean skip = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    skip = true;
                    break;
                }
            }
            if (skip) {
                break;
            }
        }
        return result;
    }
}
