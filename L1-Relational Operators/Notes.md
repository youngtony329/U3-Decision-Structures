# Unit 3 - Decision Structures

## [**L1 Sandbox**][sandbox]

## Relational Operators

Thus far, our programs have executed linearly. However, programs are able to branch, create many possible outcomes based on user input. In other words, programs can make decisions. 

[**Relational Operators**](https://www.tutorialspoint.com/java/java_relational_operators_examples.htm) allow programs to make decisions by comparing variables values. When you use these operators to make a comparison its called a `boolean expression` because these expressions evaluate to either `true` or `false`. 

Example: 
* `5 > 7`   returns `false`
* `19 <= 19` returns `true`
* `25 != 25` returns `false`

Keep in mind the [**Order of Precedence**](http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html), which puts relational operators after arithmetic operators.
![](relational%20operators.png)

Examples of boolean expressions:
![](boolean%20expressions.png)

These expressions can be passed to `System.out.println()` and assigned to variables, but will only print `true` or `false`. 

Let's see this in the [**Sandbox**][sandbox].

[sandbox]:../L1.java