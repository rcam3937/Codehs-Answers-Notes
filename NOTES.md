Notes 8-16-2022
--------------------------------------------
Change class name and file name to the SAME.
Error may not be in place error says it is.

Notes 8-18-2022
--------------------------------------------
Must have main method
MOST INCULDE SEMICOLON AT END OF executable FILE;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
System.out.println different lines. 
System.out.print same line.


Notes 8-22-2022
--------------------------------------------
  Examples of data types
    int: 24543
    double: 3.553434235678
    char: 'A'
    boolean: true/false

Char with double " will give error. Use single '.

Primitive most basic data type. 

Refrence varibles store address of value. NOT the value.

char x = 'a'  We think it will store a but really it is stored 010000001

Notes 8-16-2022
--------------------------------------------
Modulus is divide and take the remanainer

Notes 8-29-2022
--------------------------------------------

import java.util.Scanner;
//Refer to your code from the previous My Age exercise. 
// Modify it using the Scanner class to take user input instead of hard coding in your age. 

public class MyAge
{
    public static void main(String[] args)
    {
        int age;
        
        Scanner input = new Scanner(System.in);
        // Start here!
        
        System.out.print("Please enter current age: ");
        age = input.nextInt();
        
        System.out.print("My current age is: ");
        System.out.println(age);
        
        
        age++;
        System.out.print("My age next year will be: ");
        System.out.println(age);
        
        age--;
         System.out.print("My current age is: ");
         System.out.println(age);
        
    }
}



import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        
        double dinnerCost;
        double minigolfCost;
        double desertCost;
        
        Scanner input = new Scanner(System.in);
        // Start here!
        
        System.out.println("How much did dinner cost?");
        dinnerCost = input.nextDouble();  
       
        System.out.println("How much is mini-golf for one person?");
        minigolfCost = input.nextDouble();
        
        System.out.println("How much did dessert cost?");
        desertCost = input.nextDouble();
        
        System.out.print("Dinner: $ ");
        System.out.println(dinnerCost);
        
        System.out.print("Mini-Golf: $ ");
        System.out.println(minigolfCost*2);

        System.out.print("Desert: $ ");
        System.out.println(desertCost);
        
        System.out.print("Grand Total: $ ");
        System.out.println(dinnerCost+minigolfCost*2+desertCost);
        
    }



double movieRatings;

int intRound = (int) (movieRatings +0.5);             <-- Casting


int int1;
double myDouble = (double) int1;
