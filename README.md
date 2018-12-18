# CodeWars: Completed
This repository contains the instructions, rank, and code to all the Kata's I have completed on CodeWars.

# Key:
For more information, see the official [CodeWars wiki](https://github.com/codewars/codewars.com/wiki)
## Kata Ranking
The challenges (or Katas) are ranked from 8 Kyu up to 1 Kyu, where 8 is the beginners level, and 1 represents proficiency at that language.
### White (Beginner)
- 8 Kyu
- 7 Kyu
### Yellow (Novice)
- 6 Kyu
- 5 Kyu
### Blue (Competent)
- 4 Kyu
- 3 Kyu
### Purplee (Proficient)
- 2 Kyu
- 1 Kyu

# SQL Challenges
## 8 Kyu
- **SQL Basics: Simple SUM** [(Link)](https://www.codewars.com/kata/58110da0009b4f7ef80000ad)

   For this challenge you need to create a simple SUM statement that will sum all the ages.
## 7 Kyu
- **SQL Basics: Up and Down** [(Link)](https://www.codewars.com/kata/595a3ba3843b0cbf8e000004)

   Your job is to return table with similar structure and headings, where if the sum of a column is odd, the column shows the minimum value for that column, and when the sum is even, it shows the max value. You must use a case statement.
- **SQL Basics: Position** [(Link)](https://www.codewars.com/kata/59401e0e54a655a298000040)

   In each row, the characteristic column has a single comma. Your job is to find it using position(). You must return a table with the format showing `id, name, comma`, where the comma column contains the position of the comma within the characteristic string. Order the results by comma.
- **SQL: Concatenating Columns** [(Link)](https://www.codewars.com/kata/59440034e94fae05b2000073)

   Your task is to use a select statement to return a single column table containing the full title of the person (concatenate all columns together except id).
- **SQL Basics: Maths With String Manipulations** [(Link)](https://www.codewars.com/kata/594901ba44645fd7bd00005f)

   Return a single column named 'calculation' where the value is the bit length of name, added to the number of characters in race.
## 6 Kyu
- **SQL Basics: Simple IN** [(Link)](https://www.codewars.com/kata/58113c03009b4fcc66000d29)

   For this challenge you need to create a SELECT statement, this SELECT statement will use an IN to check whether a department has had a sale with a price over 98.00 dollars.
- **SQL Basics: Simple Table Totaling** [(Link)](https://www.codewars.com/kata/5809575e166583acfa000083)

   For this challenge you need to create a simple query to display each unique clan with their total points and ranked by their total points. The query must rank each clan by their `total_points`, you must return each unqiue clan and if there is no clan name you must replace it with `[no clan specified]`, you must sum the `total_points` for each clan and the `total_people` within that clan.

# Java Challenges
## 8 Kyu
- Multiply [(Link)](https://www.codewars.com/kata/50654ddff44f800200000004)

   The code does not execute properly. Try to figure out why.
- Basic Mathematical Operations [(Link)](https://www.codewars.com/kata/57356c55867b9b7a60000bd7)

   Your task is to create a function that does four basic mathematical operations. The function should take three arguments: 
   - operation(string/char)
   - value1(number)
   - value2(number).
The function should return result of numbers after applying the chosen operation.
- Return Negative [(Link)](https://www.codewars.com/kata/55685cd7ad70877c23000102)

   In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
- Opposite Number [(Link)](https://www.codewars.com/kata/56dec885c54a926dcd001095)

   Very simple, given a number, find its opposite.
## 7 Kyu
- **Get the Middle Character** [(Link)](https://www.codewars.com/kata/56747fd5cb988479af000028)

   You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
- **Printer Errors** [(Link)](https://www.codewars.com/kata/56541980fa08ab47a0000040)

   In a factory a printer prints labels for boxes. For one kind of boxes the printer has to use colors which, for the sake of simplicity, are named with letters from `a to m`.

   The colors used by the printer are recorded in a control string. For example a "good" control string would be `aaabbbbhaijjjm` meaning that the printer used three times color a, four times color b, one time color h then one time color a...

   Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced e.g. `aaaxbbbbyyhwawiwjjjwwm`.

   You have to write a function `printer_error` which given a string will output the error rate of the printer as a string representing a rational whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.

   The string has a length greater or equal to one and contains only letters from `a` to `z`.
- **Two to One** [(Link)](https://www.codewars.com/kata/5656b6906de340bd1b0000ac)

   Take 2 strings `s1` and `s2` including only letters from `[a-z]`. Return a new sorted string, the longest possible, containing only distinct letters.
- **Square Every Digit** [(Link)](https://www.codewars.com/kata/546e2562b03326a88e000020)

   Welcome. In this kata, you are asked to square every digit of a number. For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1.
- **Disemvowel Trolls** [(Link)](https://www.codewars.com/kata/52fba66badcd10859f00097e)

   Trolls are attacking your comment section! A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

   Your task is to write a function that takes a string and return a new string with all vowels removed. For example, the string `"This website is for losers LOL!"` would become `"Ths wbst s fr lsrs LL!"`.
