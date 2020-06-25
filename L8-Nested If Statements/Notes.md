# Unit 3 - Decision Structures

## [**L8 Sandbox**][sandbox]

## Nested If Statements

Another strategy for using If-statements is to nest them. **Nesting** means to put one if-statement inside another.

Let's revisit the Grade program in the [**Sandbox**][sandbox]

```java
import java.util.Scanner;
public class L5{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        //GET INPUT
        System.out.print("Enter your percentage grade:");
        boolean percentage = read.nextDouble();
        char grade; 
        
        //DETERMINE LOGIC
        if(percentage > 60){
            grade = 'D';
            if(percentage > 70){
                grade = 'C';
                if(percentage > 80){
                    grade = 'B';
                    if(percentage > 90){
                        grade = 'A';
                    }                    
                }                    
            }
        }
        else
            grade = 'F';     
    }
}
```

The problem with nested if-statements, such as the above, is the readability. This program is very difficult to decipher and understand. However, we can use nested ifs more simply. 

Again let's revisit an earlier program in the [**Sandbox**][sandbox].
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
            
            if(secondGuess > 100){
                System.out.println("Your second number is a high number.");
            }

            System.out.println("The first number is lower.");
        }else{
            
            if(firstGuess > 100){
                System.out.println("Your first number is a high number.");
            }

            System.out.println("The second number is lower.");
        }
        
        System.out.println("Thanks for playing!");
    }
}
```
Notice that you can nest an if inside the `if` or inside the `else`. This is truly what nested if-statements are meant to accomplish. The nested ifs check for a second condition that's dependent on the first. A statement that might use a nested if: 

_If you make an account, you get a 50% discount for your first month, otherwise the fee is $7.99._  

This suggests that first you make an account and then check if you are within your first month.

### WHEN TO USE WHAT

Sometimes it can get a little complicated and confusing on which decision structure to use. When designing a program, there are no absolutes. You will need to use whatever you need to make the program work accurately. However, if you consider your outcomes, the number of possible decisions, you can use the following as a guide:

* 1 outcome - if-statement
* 2 outcomes - if-else-statement/conditional operator
* 3-4 outcomes - if-else-if-statement
* 4+ outcomes - switch statement

[sandbox]:../L8.java