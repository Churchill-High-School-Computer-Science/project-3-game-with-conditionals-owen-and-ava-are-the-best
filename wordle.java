import java.util.Scanner;

public class wordle {
    public static void main(String[] args) {
    final String green = "\u001b[32m";
    final String yellow = "\u001b[33m";
    final String reset = "\u001b[0m";
    String listofwords[] = {"hello", "world", "yummy", "dummy", "coder", "doggy", "yucky", "crane", "grand", "debug"};
    String targetWord = listofwords[(int)(Math.random() * 10)];
        Scanner input = new Scanner(System.in); 
    System.out.println("Enter a random word with 5 letters:"); 
    String potentialword = input.next();
    for(int i=0;i<5;i++)
    {

    if(potentialword.substring(i, i+1).equals(targetWord.substring(i, i+1)))
    {   //letter matches
        System.out.println(green + potentialword.substring(i, i+1) + reset);
    }
    else if(targetWord.indexOf(potentialword.substring(i, i+1)) > -1)
    {   // letter in diff place 
        System.out.println(yellow + potentialword.substring(i, i+1) + reset);
    }
    else
    {
        System.out.println(potentialword.substring(i, i+1));
    }
    System.out.println("");
    if(potentialword.equals(targetWord))
    {
        System.out.println("Correct!");
    }
    if(!potentialword.equals(targetWord))
    {
        System.out.println("Wrong!");
    }
    }
}
}
