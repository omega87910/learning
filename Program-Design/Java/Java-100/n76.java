import java.util.Scanner;

public class n76 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int month = scn.nextInt();
        if(month>=3 && month<=5){
            System.out.println("Spring");
        }
        else if(month>=6&&month<=8){
            System.out.println("Summer");
        }
        else if(month>=9&&month<=11){
            System.out.println("Autumn");
        }
        else if(month==12||month<=2){
            System.out.println("Winter");
        }
    }
}
