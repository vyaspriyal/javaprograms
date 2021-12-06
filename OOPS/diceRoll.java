import java.util.*;
public class diceRoll{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        Dice d = new Dice();
        int roll = s.nextInt();
        d.rollDice(roll);

    }// end of  main method

}// end of diceRoll class


class Dice{
    int roll ;

    public void rollDice(int roll){
        this.roll = roll;
        Random rand = new Random();
        int valueDice1 = rand.nextInt(6)+1;
        int valueDice2 = rand.nextInt(6)+1;
        System.out.println("Dice1:"+ valueDice1);
        System.out.println("Dice2:"+ valueDice2);
    }

}// end of dice

