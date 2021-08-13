/*
Problem Name: 182. Duplicate Emails
Problem Link: https://leetcode.com/problems/duplicate-emails/
Difficulty: Easy
*/
# Write your MySQL query statement below

SELECT DISTINCT P1.Email FROM Person P1, Person P2 WHERE P1.Email = P2.Email and P1.id != P2.id;

/*
Another Solution:
SELECT Email FROM Person GROUP BY EMAIL HAVING COUNT(*) > 1;
*/
