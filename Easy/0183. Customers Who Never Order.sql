/*
Problem Name: 183. Customers Who Never Order
Problem Link: https://leetcode.com/problems/customers-who-never-order/
Difficulty: Easy
*/
# Write your MySQL query statement below

SELECT Name AS Customers FROM Customers WHERE Id NOT IN (SELECT CustomerId FROM Orders);
