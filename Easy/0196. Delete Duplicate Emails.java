/*
Problem Name: 196. Delete Duplicate Emails
Problem Link: https://leetcode.com/problems/delete-duplicate-emails/
*/

# Write your MySQL query statement below

DELETE p1 FROM Person p1, Person p2 where p1.Email = p2.Email AND p1.Id > p2.Id;
