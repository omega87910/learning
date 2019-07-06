import java.util.Scanner;

public class n29 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b =1;
        while(a>0){
            b=b*a;
            a--;
        }
        System.out.println(b);
    }
}
