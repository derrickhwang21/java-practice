# Lab 02: Maps

## Feature Task
This lab uses a given weather data set. Through iteration of the data we are tasked to find the min and max values. Using a HashSet of type Integer to keep track of all the unique temperatures seen. Result by printing out any temperature not seen during the month.

Input:
`// Daily average temperatures for Seattle, October 1-28 2017
 int[][] weeklyMonthTemperatures = {
   {66, 64, 58, 65, 71, 57, 60},
   {57, 65, 65, 70, 72, 65, 51},
   {55, 54, 60, 53, 59, 57, 61},
   {65, 56, 55, 52, 55, 62, 57}
 };`

Output:
 `High: 72
  Low: 51
  Never saw temperature: 63
  Never saw temperature: 67
  Never saw temperature: 68
  Never saw temperature: 69`

## Library Class Description
The Library class
1. getMaxValue() - Returns highest integer within a hashet
2. getMinValue() - Returns the lowest integer within a hashet
3. getMissingElement() - Using an iterative method, find the value of not present during the iteration between and adding the resulting missing values into a new instance of hashet to return
4. getUniqueValue() - Return an arraylist of strings that formats to the example output.
5. tally() - taking in an List of String which represents votes to return one string that using the input to create a new instance of a hashmap that shows what got the most votes
5. voting() - Helper function for tally() to determine the key candidate who received the most votes



