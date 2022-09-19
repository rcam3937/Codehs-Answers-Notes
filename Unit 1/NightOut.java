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
}