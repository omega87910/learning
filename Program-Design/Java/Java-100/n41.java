import java.util.Scanner;

public class n41 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int a=0;
        while(n>0){
            n=n/10;
            a++;
        }
        System.out.println(a);
    }
}
