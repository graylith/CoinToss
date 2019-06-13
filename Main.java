
package cointoss;
import java.util.*;

public class Main {

    /**
     *
     * @return
     */
    public int TossACoin(){
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt())%2;
        return toss;      
    }
    public static void main(String[] args) {
        Main game = new Main();
        System.out.println("Enter your choice : 0 for HEADS and 1 for TAILS");
        int Choice;
        int result;
        Scanner sc = new Scanner(System.in);
        Choice = sc.nextInt();
        result = game.TossACoin();
     
        if(Choice == result){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
          
    }
}
