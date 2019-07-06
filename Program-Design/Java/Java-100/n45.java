import java.util.Random;
import java.util.Scanner;

public class n45 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rd = new Random();
        int seed = scn.nextInt();
        rd.setSeed(seed);
        int Ans = rd.nextInt(100);
        int playerAns=0;
        while(playerAns!=Ans){
            playerAns=scn.nextInt();
            if(playerAns>Ans){System.out.println("big");}
            else if(playerAns<Ans){System.out.println("small");}
            else if(playerAns==Ans){System.out.println("true");}
        }
    }
}
