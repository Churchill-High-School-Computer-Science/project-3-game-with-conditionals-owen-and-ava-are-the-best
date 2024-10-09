import java.util.Scanner;

public class wordle {
    public static void main(String[] args) {
    final String green = "\u001B[32m";
    final String yellow = "\u001B[33m";
    final String black = "\u001B[30m";
    String listofwords[] = {"hello", "world", "yummy", "dummy", "coder", "doggy", "yucky", "crane", "grand", "debug"};
    String targetWord = listofwords[(int)(Math.random() * 10)];
        Scanner input = new Scanner(System.in); 
    System.out.println("Enter a random word with 5 letters:"); 
    String potentialword = input.next();
    if(potentialword.substring(0, 1).equals(targetWord.substring(0, 1)))
    {   //letter matches
        System.out.println(green + potentialword.substring(0, 1) + green);
    }
    else if(targetWord.indexOf(potentialword.substring(0,1)) > -1)
    {   // letter in diff place 
        System.out.println(yellow + potentialword.substring(0, 1) + yellow);
    }
    else if(potentialword.substring(5).equals(targetWord))
    {
        System.out.println("Game over! The word was " + targetWord);
    }
    else
    {
        System.out.println(black + potentialword.substring(0, 1));
    }
    }
   
}
