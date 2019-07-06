import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char word = scn.next().charAt(0);
        int a = (int) word;
        if (a>=65 && a<=90){
            System.out.println("uppercase");
        }
        else if(a>=97 && a<=122){
            System.out.println("lowercase");
        }
        else{
            System.out.println("special character");
        }
    }
}
