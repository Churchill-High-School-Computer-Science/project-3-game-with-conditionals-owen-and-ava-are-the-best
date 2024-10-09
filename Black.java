import java.util.ArrayList;
import java.util.Scanner;

public class Black {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Player player = new Player();
            Player dealer = new Player();
            
            ArrayList<Integer> playerhand = new ArrayList<>();
            ArrayList<Integer> dealerhand = new ArrayList<>();
            
            int playertotal = player.builddeck(playerhand);
            int dealertotal = dealer.builddeck(dealerhand);
            
            System.out.println("Your hand: " + playerhand + " (Total: " + playertotal + ")");
            System.out.println("Dealer shows: " + dealerhand.get(0));
            
            OUTER:
            while (true) {
                System.out.println("Hit(1) or Stand(2)? ");
                int playerchoice = input.nextInt();
                switch (playerchoice) {
                    case 1 -> {
                        playertotal = player.hit(playerhand, playertotal);
                        System.out.println("Your hand: " + playerhand + " (Total: " + playertotal + ")");
                        if (playertotal > 21) {
                            System.out.println("Player busted. Dealer wins.");
                            return;
                        }
                    }
                    case 2 -> {
                        break OUTER;
                    }
                    default -> System.out.println("Invalid choice. Please select 1 to Hit or 2 to Stand.");
                }
            }
            
            System.out.println("Dealer's turn.");
            while (dealertotal <= 17) {
                dealertotal = dealer.hit(dealerhand, dealertotal);
                System.out.println("Dealer's hand: " + dealerhand + " (Total: " + dealertotal + ")");
            }
            
            if (dealertotal > 21) {
                System.out.println("Dealer busted. Player wins!");
            } else if (playertotal > dealertotal) {
                System.out.println("Player wins!");
            } else if (dealertotal > playertotal) {
                System.out.println("Dealer wins.");
            } else {
                System.out.println("It's a tie!");
            }
        }
    }
}
