/*Tester*/

import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Ask for a word
        System.out.println("Please insert a word");
        String word = scanner.nextLine();

        WordGames text = new WordGames(word);
        System.out.println(text.scramble());
     
     
        System.out.println("Enter an integer: ");
        int idx = scanner.nextInt();
        scanner.nextLine();  
        System.out.println("Enter another word: ");
        String rand = scanner.nextLine();
        System.out.println(text.bananaSplit(idx, rand));
   
        
        
        System.out.println("Enter a character: ");
        String character = scanner.nextLine();
        System.out.println("Enter another word: ");
        String word1 = scanner.nextLine();
        System.out.println(text.bananaSplit(character, word1));


        
        
        
    }
}




//WordGames

public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        // switch first half
        // and second half
        /*int length = word.length();
        int half = length/2;
        String scramble = word.substring(half) + word.substring(0,half);
        return scramble;*/
        return word.substring(word.length()/2) + word.substring(0,word.length()/2);
      
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        return(word.substring(0, insertIdx) + insertText + word.substring(insertIdx));
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insert
        int temp2 = word.indexOf(insertChar);
        return(word.substring(0, temp2) + insertText + word.substring(temp2));
        
    }
    
    
    public String toString()
    {
        // Games[word]
        word = "[" + word + "]";
        return word;
    }
    
    
}
