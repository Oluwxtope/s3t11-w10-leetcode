package com.bptn.leetcode.problem2;

import java.util.Arrays;

public class SquaresOfSortedArray {

	public int[] sortedSquares(int[] nums) {

		return Arrays.stream(nums) // convert array to stream
				.map(num -> num * num) // square each number
				.sorted() // sort array
				.toArray(); // convert back to array
	}

}
