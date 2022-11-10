//Pizza.java
//-----------

public class Pizza
{
    // Add the instance variables here
    private String type;
    private String toppings;
    private int size;
    
    // Put the constructor here
    public Pizza(String theType, String theToppings, int theSize)
    {
    
        size = theSize;
        type = theType;
        toppings = theToppings;
        
    }
    // You don't need to do anything with this method
    // Used to print the object
    public String toString()
    {
        return size + " inch " + type + " pizza with " + toppings;
    }
}

//PizzaTester.java
//-------------------

public class PizzaTester 
{
    public static void main(String[] args)
    {
        // Test your Pizza class here.
        Pizza veggie = new Pizza("Veggie", "Tomatoes, onions, olives", 12  );
        Pizza cheese = new Pizza("Cheese", "Cheese", 15);
        Pizza meat = new Pizza("Meat", "Pepperoni, sausage, bacon", 20);

    System.out.println(veggie);
    System.out.println(cheese);
    System.out.println(meat);

    }
}