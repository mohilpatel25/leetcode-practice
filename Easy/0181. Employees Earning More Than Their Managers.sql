/*
Problem Name: 181. Employees Earning More Than Their Managers
Problem Link: https://leetcode.com/problems/employees-earning-more-than-their-managers/
Difficulty: Easy
*/
# Write your MySQL query statement below

SELECT E.Name as Employee FROM Employee as E, Employee as M WHERE E.ManagerId = M.Id AND E.Salary > M.Salary;
