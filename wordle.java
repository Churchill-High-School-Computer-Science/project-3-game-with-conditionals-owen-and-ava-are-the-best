import java.util.Scanner;

public class wordle {
    public static void main(String[] args) {
    String listofwords[] = {"hello", "world", "java", "programming", "coding", "computer", "science", "algorithm", "development", "debugging"};
    double targetWord[] = {Math.floor(Math.random() * listofwords.length)};
    Integer.MAX_VALUE = 6;
        Scanner input = new Scanner(System.in); 
    System.out.println("Enter a random word with 5 letters:"); 
    String potentialword = input.nextLine();
    if(targetWord.equals(potentialword))
    {
        System.out.println("Game over! The word was " + targetWord);
    }
    else if(MAX_VALUE.less(potentialword))
    {
        System.out.println("Too many words! Enter another random word with 5 letters");
    }

    }
   
}
