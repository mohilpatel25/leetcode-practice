/*
Problem Name: 197. Rising Temperature
Problem Link: https://leetcode.com/problems/rising-temperature/
Difficulty: Easy
*/

# Write your MySQL query statement below

SELECT W1.id from Weather W1, Weather W2 where W1.Temperature > W2.Temperature AND DATEDIFF(W1.recordDate, W2.recordDate) = 1;
