/*
Problem Name: 176. Second Highest Salary
Problem Link: https://leetcode.com/problems/second-highest-salary/
Difficulty: Easy
*/
# Write your MySQL query statement below

SELECT MAX(Salary) AS SecondHighestSalary FROM Employee Where Salary NOT IN (SELECT MAX(Salary) FROM Employee);

/*
Another Solution:

SELECT MAX(Salary) AS SecondHighestSalary FROM Employee Where Salary < (SELECT MAX(Salary) FROM Employee);
*/
