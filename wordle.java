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
        for(int j=0;j<5;j++){

    if(potentialword.substring(j, j+1).equals(targetWord.substring(j, j+1)))
    {   //letter matches
        System.out.print(green + potentialword.substring(j, j+1) + reset);
    }
    else if(targetWord.indexOf(potentialword.substring(j, j+1)) > -1)
    {   // letter in diff place 
        System.out.print(yellow + potentialword.substring(j, j+1) + reset);
    }
    else
    {
        System.out.print(potentialword.substring(j, j+1));

    }
    }
    if(potentialword.equals(targetWord))
    {
        System.out.println(" Correct!");
        break;
    }
    System.out.println("");
    System.out.println("Enter a random word with 5 letters:"); 
    potentialword = input.next();
    }
    if(!potentialword.equals(targetWord))
    {
        System.out.println("Wrong! The correct word is " + targetWord);
    }
}
}
