import java.util.Scanner;


public class Main { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rock/Paper/Scissors: ");
        String player = input.next();
        String[] cpu = {"Rock", "Paper", "Scissors"};
        int guess = (int) (Math.random() * 2) + 1;
        String cpuchoice = cpu[guess];
        System.out.println(cpuchoice);
        switch (player) {
            case "Rock" -> {
            switch (cpuchoice) {
                case "Rock" -> System.out.println("Tie!");
                case "Paper" -> {
                    System.out.println("You lose!");
                }
                default -> {
                    System.out.println("You win!");
                }
            }
            }
            case "Paper" -> {
            switch (cpuchoice) {
                case "Rock" -> {
                    System.out.println("You win!");
                }
                case "Paper" -> System.out.println("Tie!");
                default -> {
                    System.out.println("You lose!");
                }
            }
            }
            case "Scissors" -> {
            switch (cpuchoice) {
                case "Rock" -> {
                    System.out.println("You lose!");
                }
                case "Paper" -> {
                    System.out.println("You win!");
                }
                default -> System.out.println("Tie!");
            }
            }
            default -> System.out.println("Invalid input");
        }
    
    }
   
}
