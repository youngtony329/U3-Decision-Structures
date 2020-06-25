# Unit 3 - Decision Structures

## [**L10 Sandbox**][sandbox]

## Conditional Operator

The last and most powerful decision structure is the [**Conditional Operator**](https://www.tutorialspoint.com/What-is-the-conditional-operator-in-Java). Its primary usage is to assign a value to a variable based on a condition, or if-statement.

The syntax is: 
`(boolean expression) ? (value if true) : (value if false)`

_A phone company charges $0.99 per MB of data with a minimum of $50 per month._

In this problem, the monthly cost of a phone plan is either 0.99 * data or $50 whichever is higher. 

```java
double totalMonthly = dataUsed * 0.99;

totalMonthly = (totalMonthy> 50.0)?totalMonthly:50.0
```

This is exactly the same as the following:
```java
double totalMonthly = dataUsed * 0.99;

if(totalMonthly > 50.0)
    totalMonthly = totalMOnthly;
else
    totalMonthly = 50.0
```

Let's jump into the [**Sandbox**][sandbox] and look at some more examples.

[sandbox]:../L10.java