import java.util.ArrayList;
import java.util.Scanner;


public class Black {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer playercard1 = (int) (Math.random() * 11) + 1;
        Integer playercard2 = (int) (Math.random() * 11) + 1;
        Integer dealercard1 = (int) (Math.random() * 11) + 1;
        Integer dealercard2 = (int) (Math.random() * 11) + 1;
        ArrayList <Integer> playerhand = new ArrayList <Integer>() ;
        ArrayList <Integer> dealerhand = new ArrayList <Integer>() ;
        Integer playertotal = 0;
        Integer dealertotal = 0;
        playertotal = playertotal + playercard1 + playercard2;
        dealertotal = dealertotal + dealercard1 + dealercard2;
        playerhand.add(playercard1);
        playerhand.add(playercard2);
        System.out.print(playertotal);
        dealerhand.add(dealercard1);
        dealerhand.add(dealercard2);
        System.out.println(playerhand);
        System.out.println(dealercard1);
        System.out.print("Hit(1) or Stand(2)? ");
        Integer playerchoice = input.nextInt();
        if (playerchoice == 1){

        }


        
    }
}

