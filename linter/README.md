# Linter
JavaScript Linter. A method that reads a JS file and prints an error whenever it finds a line that doesn't end in a semicolon

## Approach
Used BufferedRead methods to iterate through input files.
Applied conditional statements which checks if any of the scanned line ends with characters that allows for semicolons
If the string character isn't present then we increment our error counter and print alert message.
In the end we return the error count to use for assertion test to check if expected missing is equal to the return result.