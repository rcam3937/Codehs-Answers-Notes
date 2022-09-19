import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        // Start here!
        
        double myDouble;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number with decimal");
        myDouble = input.nextDouble();
        
        int myDouble2 = (int) myDouble;
        
        System.out.print(myDouble2);

        
        
    }
}