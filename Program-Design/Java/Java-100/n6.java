import java.util.Scanner;

public class n6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char word = scn.next().charAt(0);
        int a = (int)word;
        if(a>=65 && a<=90){
            a+=32;
        }
        else if (a>=97 && a<=122){
            a-=32;
        }
        word =(char) a;
        System.out.println(word);
    }
}
