import java.util.Scanner;

public class wordle {
    public static void main(String[] args) {
    final String green = "\u001b[421m"
    final String yellow = "\u001b[43m"
    final String clear = "\u001b[0m"
    String listofwords[] = {"hello", "world", "yummy", "dummy", "coder", "doggy", "yucky", "crane", "grand", "debug"};
    String targetWord = listofwords[(int)(Math.random() * 10)];
    Integer.MAX_VALUE = 6;
        Scanner input = new Scanner(System.in); 
    System.out.println("Enter a random word with 5 letters:"); 
    String potentialword = input.nextLine();
    if(potentialword.substring(0, 1).equals(targetWord.substring(0, 1)))
    {
        System.out.println(green + potentialword.substring(0, 1) + clear);
    }
    else if(targetWord.indexOf(potentialword.substring(0,1) > -1))
    {
        System.out.println(green + potentialword.substring(0, 1) + clear);
    }
    else if(potentialword.substring(5).equals(targetWord))
    {
        System.out.println("Game over! The word was " + targetWord);
    }
    else if(MAX_VALUE.less(potentialword))
    {
        System.out.println("Too many words! Enter another random word with 5 letters");
    }

    }
   
}
