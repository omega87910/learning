import java.util.Scanner;

public class n20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if(b>=a && b<=c){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
