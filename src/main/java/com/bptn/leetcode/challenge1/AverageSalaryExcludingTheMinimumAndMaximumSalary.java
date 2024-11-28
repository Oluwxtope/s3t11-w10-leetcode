package com.bptn.leetcode.challenge1;

class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        int maxSalary = salary[0]; // Initialize a variable to track the maximum salary
        int minSalary = salary[0]; // Initialize a variable to track the minimum salary
        int sumSalary = 0; // Initialize a variable to track the sum of salaries
        int lenOfSalary = salary.length; // Store the length of the salary array
        for (int currSalary : salary) { // Loop through the salary array
            if (currSalary < minSalary) { // Update minimum salary if current salary is less than it
                minSalary = currSalary;
            }

            if (currSalary > maxSalary) { // Update maximum salary if current salary is greater than it
                maxSalary = currSalary;
            }

            sumSalary += currSalary; // Add current salary to sum of salary variable
        }
        // To get the answer, remove max and min salary from the sum of salaries and divide by number of salaries - 2
        // to make up for not tracking max and min salaries. Cast to double
        return ((double) (sumSalary - maxSalary - minSalary)) / (lenOfSalary - 2);
    }
}
