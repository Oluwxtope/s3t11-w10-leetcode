package com.bptn.leetcode.challenge3;

public class MissingNumber {
	
	public int missingNumber(int[] nums) {
        int n = nums.length;
        // Calculate the total sum of numbers from 0 to n
        int sumTotal = n * (n + 1) / 2;
        
        // Calculate the sum of numbers in the array
        int sumNums = 0;
        for (int num : nums) {
            sumNums += num;
        }
        
        // The missing number is the difference between the total sum and the sum of array elements
        return sumTotal - sumNums;
    }

}
