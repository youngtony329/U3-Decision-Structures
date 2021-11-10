# Unit 3 - Decision Structures

## [**L3 Sandbox**][sandbox]

## If-Else Statements

[**If-Else Statements**](https://www.tutorialspoint.com/java/if_else_statement_in_java.htm) are similar to if-statements but includes an **else** block which executes if the boolean expression evaluates to `false`.

Let's explore an example in the [**Sandbox**][sandbox]:

```java
import java.util.Scanner;

public class Grades{

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Please enter a number:");
        int firstGuess = read.nextInt();
        System.out.print("Please enter another number:");
        int secondGuess = read.nextInt();
        
        if(firstGuess < secondGuess){
            System.out.println("The first number is lower.");
        }else{
            System.out.println("The second number is lower.");
        }
        
        System.out.println("Thanks for playing!");
    }
}
```

[sandbox]:../L3.java