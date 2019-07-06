import java.util.Scanner;

public class n15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c =1;
        int d=1;
        int e=1;
        for(int i=1;i<=a;i++){
            c=c*i;
        }
        for(int j=1;j<=b;j++){
            d=d*j;
        }
        for(int k=1 ;k<=a-b;k++){
            e = e*k;
        }
        System.out.println(c/(d*e));
    }
}
