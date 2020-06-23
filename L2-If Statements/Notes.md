# Unit 3 - Decision Structures

## [**L2 Sandbox**][sandbox]

## If Statements

[**If-Statements**](https://www.tutorialspoint.com/java/if_statement_in_java.htm) are the way computers make decisions. They are written as:

```
if(boolean expression){
    //code to be executed
}
``` 
The most important part of the if statement is the boolean expression. If it evaluates to true, then anything within the scope of the if-statement is executed. If the boolean expression is false, then flow of execution passes to the next statement after the if-statement.

Let's look at the following in the [**Sandbox**][sandbox]:

```java
import java.util.Scanner;

public class L2{

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Please enter a number:");
        int firstGuess = read.nextInt();
        System.out.print("Please enter another number:");
        int secondGuess = read.nextInt();
        
        if(firstGuess < secondGuess){
            System.out.println("The first number is lower.");
        }
        
        if(firstGuess > secondGuess){
            System.out.println("The second number is lower.");
        }

        if(firstGuess == secondGuess){
            System.out.println("The numbers are the same.");
        }
        
        System.out.println("Thanks for playing!");
    }
}
```

Keep in mind that if-statements will execute linearly if their boolean-expressions are true. Let's explore this [**Sandbox**][sandbox] :

```java
import java.util.Scanner;

public class L2{

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Please enter a number:");
        int firstGuess = read.nextInt();
        
        if(firstGuess > 80){
            System.out.println("The number is greater than 80");
        }
        
        if(firstGuess >= 90){
            System.out.println("The number is greater than 90");
        }

        if(firstGuess < 50){
            System.out.println("The number is less than 50");
        }
        
        System.out.println("Thanks for playing!");
    }
}
```

### Flags

Flags are simple boolean variable. They can be used to signal an if-statement to execute. 

Let's modify the [**Sandbox**][sandbox] :

```

boolean highNumber = false; 

if(firstGuess >= 100){
    highNumber = true;
}

if(highNumber){
    System.out.println("Wow, that's a high number!");
}
```

Though this example is trivial, we can apply this idea across classes and methods and create sophisticated checks for various conditions. We will explore this more in a later sections. 

[sandbox]:../L2.java