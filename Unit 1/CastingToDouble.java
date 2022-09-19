import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        // Start here!
        
        int int1;
        int int2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first intger");
        int1 = input.nextInt();
        
        System.out.println("Enter second intger");
        int2 = input.nextInt();
        
        System.out.println("First Int: " + int1);
        System.out.println("Second Int: " + int2);
        
        double myDouble = (double) int1/int2;
        System.out.print(myDouble);
        
        
        
        

    }
}