//Website.java
//-------------

public class Website
{
    
    private String domain;
    private String topLevelDomain;
    private int numUsers;
    
    // Put your code here
    //Default constructor
    public Website()
    {
        domain = "";
        topLevelDomain = "com";
        numUsers = 0;
    }

    // Specify website URL
    // Register a new website
    public Website(String domainName, String topDomain)
    {
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = 0;
    }
    // Specify website URL
    // Register an old website
    public Website(String domainName, String topDomain, int numPeople)
    {
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = numPeople;
    }
    

    // String representation for printing
    // Do not modify this method
    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";
        
        return res;
    }
}


//WebsiteTester
//-------------

public class WebsiteTester
{
    public static void main(String[] args)
    {
        // Make Pinatas!
        Website ella = new Website();
        Website pete = new Website("test", "com");
        Website sweetie = new Website("codehs", "com", 1000);

        // Print the pinatas
        System.out.println(ella);
        System.out.println(pete);
        System.out.println(sweetie);
        
        
    }
}