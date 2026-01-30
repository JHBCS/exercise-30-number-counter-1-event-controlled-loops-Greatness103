# 20-Exercise-30
## Number Counter 1 - Event-Controlled (Input)
# Input-Dependent Events

Often, you will want to continue a process while there is still valid input to be entered.  You won't know how many items there are to be input, so you can't use a count-controlled loop.    You need some _invalid_ value to be entered to signal that the input is complete.

For example, imagine that I wanted to find the average of all the marks on a test.  To calculate an average, I need to sum all the grades entered, then divide by the number of grades.

I need a loop that will ask for the next grade continuously, add the grade to a total, and keep track of the number of grades entered.  And I need it to _stop_ asking for input when I've reached my last grade.

Look at the following code:

```java
int count = 0;
double grade;
double sum;
double average;

grade = in.nextInt();  //collect first grade

while (grade != -1){
  count++;
  sum = sum + grade;

  grade = in.nextInt(); //loop update
}

average = sum / count; 
```

> What makes the code stop? (i.e. what is the termination condition?

**When a grade of -1 is entered, the loop terminates.**

-1 was chosen because it's an _invalid_ value in this situation.  It's impossible in this scenario to have a grade that is a negative value.  I could also have chosen a termination condition of `i<0`, to make any negative value the termination condition.

# Instructions

Write a program that accepts numbers (both positive and negative) from the keyboard as input until a 0 is entered.

Your output should resemble the following:

```
Enter a number (0 to stop): 14
Enter a number (0 to stop): -12
Enter a number (0 to stop): 1
Enter a number (0 to stop): -10
Enter a number (0 to stop): 0
end of processing
```
