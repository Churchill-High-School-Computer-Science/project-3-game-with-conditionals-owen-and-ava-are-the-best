import java.util.ArrayList;

public class Player {
    public int hit(ArrayList<Integer> hand, int total) {
        int newCard = (int) (Math.random() * 11) + 1;
        hand.add(newCard);
        total += newCard;
        return total;
    }

    public int builddeck(ArrayList <Integer> hand ){
        int card1 = (int) (Math.random() * 11) + 1;
        int card2 = (int) (Math.random() * 11) + 1;
        hand.add(card1);
        hand.add(card2);
        return card1 + card2;
    }   
    
}
