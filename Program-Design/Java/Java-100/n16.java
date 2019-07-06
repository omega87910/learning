import java.util.Scanner;

public class n16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char str = scn.next().charAt(0);
        int a = (int) str;

        if(a>=65 && a<=90){
            System.out.println("capital");
        }
        else if (a>=97 && a<=122){
            System.out.println("lowercase");
        }
        else{
            System.out.println("special");
        }
    }
}
