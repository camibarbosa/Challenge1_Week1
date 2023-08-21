# My progress in Challenge 1

## Question 1
The main method it starts by initializing an instance variable as 0. 
The "Student" class implements the "Comparable" interface for sorting and the "Student" constructor is used to initialize the class attributes. The list of students is sorted using the "Collections.sort()" method. It iterates through each student's information, extracting a data from the end of their string. This data is compared with a recorded smallest value. If the extracted note is lower than the recorded value, a new "failedStudent" situation is identified.

## Question 2
The String variable "emotionExpressed" is used to store the emotion declared from the input. It reads a line of input from the user using scanner.nextLine() and stores it in the "inputLine variable". Having them, it calls the "occurrences" method to count occurrences of two emoticons: ":-)" and ":-(" within the inputLine. Then the code uses the counts of fun and upset emoticons to determine the emotion expressed. The final method takes two arguments: a "message" string and a "pattern" and calculates the number of occurrences using the indexOf method, updating the "occurrencePosition" to search for the next occurrence to no more occurrences are found.

## Question 3
The first variable "test" will track of the test cases.
Inside the while loop if the "inputNumber" is equal to 0, the loop is broken using the break statement. If its not,
the loop iterates "inputNumber" times, reading an integer "numberChosen" and performing calculations based on the chosen operator. The program then prints the test number and increments the test variable using test++ and prints the calculated result.

## Question 4
The constraints like "UNIQUE" and "NOT NULL" are used to ensure data integrity and uniqueness. A foreign key (id_address) relationship is established between the "Person" table and the "Address" table.

## Question 5
The "_id" field is used to identify each document in the collection. The "Person" fields contain attributes of the individual and "Address" fields store the attributes about the individual's address.
