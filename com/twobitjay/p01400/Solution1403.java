package com.twobitjay.p01400;

import com.twobitjay.common.LeetAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@LeetAnnotations(id=1403,
        name="Minimum Subsequence in Non-Increasing Order",
        url = "https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/")
public class Solution1403 {
    public List<Integer> minSubsequence(int[] nums) {
        // Find sum
        int sum = Arrays.stream(nums).sum();

        // sort
        Arrays.sort(nums);

        // Remove the numbers from sum until you find the right match
        List<Integer> result = new ArrayList<>();
        int newSum = 0;
        for(int i=nums.length-1; i>=0; i--) {
            sum = sum - nums[i];
            newSum = newSum + nums[i];
            result.add(nums[i]);

            if(newSum > sum) {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution1403 obj = new Solution1403();
        System.out.println(obj.minSubsequence(new int[]{4, 2, 0, 1}));
    }
}

