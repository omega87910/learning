import java.util.Scanner;

public class n28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b =1;
        for(int i = 1 ;i<=a;i++){
            b = b * i;
        }
        System.out.println(b);
    }
}
