# Problem Name: 195. Tenth Line
# Problem Link: https://leetcode.com/problems/tenth-line/

Difficulty: Easy
# Read from the file file.txt and output the tenth line to stdout.
input="file.txt"
i=10
while IFS= read -r line
do
    i=$( expr $i - 1 )
    if [ $i -eq 0 ]
    then
      echo $line
    fi
done < "$input"
