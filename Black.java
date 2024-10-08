import java.util.ArrayList;
import java.util.Scanner;


public class Black {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Player player = new Player();
        Player dealer = new Player();

        ArrayList <Integer> playerhand = new ArrayList <>() ;
        ArrayList <Integer> dealerhand = new ArrayList <>() ;

        Integer playertotal = player.builddeck(playerhand);
        Integer dealertotal = dealer.builddeck(dealerhand);

        System.out.print(playertotal);
        System.out.println(playerhand);
        System.out.println(dealerhand.get(0));
        System.out.println("Hit(1) or Stand(2)? ");
        Integer playerchoice = input.nextInt();
        if (playerchoice == 1){
            Integer newplayercard = (int) (Math.random() * 11) + 1;
            playerhand.add(newplayercard);
            playertotal = playertotal + newplayercard;
            System.out.print(playertotal);
            System.out.println(playerhand);
            if (playertotal > 21) {
                System.out.println("Player busted");
            }
        }   


        
    }
}

