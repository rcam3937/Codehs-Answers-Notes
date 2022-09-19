import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        // Start here!
       
       double movieRating;
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter movie rating (as a decimal)");
       movieRating = input.nextDouble();
       
       int intRound = (int) (movieRating + 0.5);
       
       System.out.print("Rating rounded: " + intRound);
    }
}