import java.util.ArrayList;

public class Player {
    public void hit(){

    }

    public int builddeck(ArrayList <Integer> x ){
        Integer card1 = (int) (Math.random() * 11) + 1;
        Integer card2 = (int) (Math.random() * 11) + 1;
        x.add(card1);
        x.add(card2);
        System.out.print(x);
        return card1 + card2;
    }   
    
}
