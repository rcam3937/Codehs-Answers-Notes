/*Pinata.java:
-----------*/

public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    public Pinata(String pinCandy, String pinColor, String pinShape)
    {
        candy = pinCandy;
        color = pinColor;
        shape = pinShape;
    }
    // Add an overloaded constructor that allows the user
    // to customize the color and shape
    public Pinata(String pinColor, String pinShape)
    {
        candy = "hard candy";
        color = pinColor;
        shape = pinShape;
    }
    
    
    // Add an overloaded constructor that allows the user
    // to customize the candy
    public Pinata(String pinCandy)
    {
        candy = pinCandy;
        color = "rainbow";
        shape = "donkey";
    }
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}


/*PinataTester.java:
-----------------*/

public class PinataTester
{
    public static void main(String[] args)
    {
        // Make Pinatas!
        Pinata ella = new Pinata();
        Pinata pete = new Pinata("chocolate", "blue", "star");
        Pinata sweetie = new Pinata("sour straws");
        
        // Print the pinatas
        System.out.println(ella);
        System.out.println(pete);
        System.out.println(sweetie);
        
        
    }
}